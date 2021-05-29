package eapli.base.tarefa.persistance;

import eapli.base.Application;
import eapli.base.Utils.QueryMaker;
import eapli.base.catalogo.domain.Catalogo;
import eapli.base.colaborador.domain.Colaborador;
import eapli.base.equipa.domain.Equipa;
import eapli.base.servico.domain.Titulo;
import eapli.base.tarefa.domain.TarefaManual;
import eapli.base.tarefa.domain.TarefaManualAprovacao;
import eapli.base.tarefa.domain.TarefaManualExecucao;
import eapli.base.tarefa.domain.estado.EstadoAprovacao;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.Query;


public class TarefaExecucaoRepositorioJPAimpl extends JpaAutoTxRepository<TarefaManual, Long, Long>
        implements TarefaExecucaoRepositorio {

    public TarefaExecucaoRepositorioJPAimpl(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "eapli.base");
    }

    @Override
    public Iterable<TarefaManualExecucao> tarefasManuaisExecucaoNA(Equipa equipa) {
        QueryMaker qm = new QueryMaker();
        final Query query = qm.criarEntityManager("eapli.base").createQuery("SELECT t from TarefaManualExecucao t where t.equipasExecuta.size != 0 and :equipa MEMBER of t.equipasExecuta", TarefaManualExecucao.class);
        query.setParameter("equipa", equipa);
        return query.getResultList();
    }

    @Override
    public Iterable<TarefaManualAprovacao> tarefasManuaisAprovacaoNA(Colaborador colaborador) {
        QueryMaker qm = new QueryMaker();
        final Query query = qm.criarEntityManager("eapli.base").createQuery("SELECT t from TarefaManualAprovacao t where t.estadoAprovacao = :a and :colaborador MEMBER of colabsAprova", TarefaManualAprovacao.class);
        query.setParameter("colaborador", colaborador);
        query.setParameter("a", EstadoAprovacao.POR_APROVAR);
        return query.getResultList();
    }
}

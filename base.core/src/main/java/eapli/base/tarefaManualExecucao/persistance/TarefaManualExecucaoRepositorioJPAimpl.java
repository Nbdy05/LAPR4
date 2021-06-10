package eapli.base.tarefaManualExecucao.persistance;

import eapli.base.Application;
import eapli.base.Utils.QueryMaker;
import eapli.base.colaborador.domain.Colaborador;
import eapli.base.equipa.domain.Equipa;
import eapli.base.tarefaManualAprovacao.domain.TarefaManualAprovacao;
import eapli.base.tarefaManualExecucao.domain.TarefaManualExecucao;
import eapli.base.tarefaManualAprovacao.domain.EstadoAprovacao;
import eapli.base.tarefaManualExecucao.domain.EstadoRealizacao;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.Query;


public class TarefaManualExecucaoRepositorioJPAimpl extends JpaAutoTxRepository<TarefaManualExecucao, Long, Long>
        implements TarefaManualExecucaoRepositorio {

    public TarefaManualExecucaoRepositorioJPAimpl(String puname) {
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
    public Iterable<TarefaManualExecucao> tarefasManuaisExecucaoPendentes(Colaborador colaborador) {
        QueryMaker qm = new QueryMaker();
        final Query query = qm.criarEntityManager("eapli.base").createQuery("SELECT t from TarefaManualExecucao t where t.estadoRealizacao = :a and :colaborador = t.colabExecuta", TarefaManualExecucao.class);
        query.setParameter("colaborador", colaborador);
        query.setParameter("a", EstadoRealizacao.POR_EXECUTAR);
        return query.getResultList();
    }

    /*
    @Override
    public Iterable<TarefaManualExecucao> tarefasManuaisExecucaoColab(Colaborador colab) {
        QueryMaker qm = new QueryMaker();
        final Query query = qm.criarEntityManager("eapli.base").createQuery("SELECT t from TarefaManualExecucao t where t.colabExecuta = :colab", TarefaManualExecucao.class);
        query.setParameter("colab", colab);
        return query.getResultList();
    }

     */
}

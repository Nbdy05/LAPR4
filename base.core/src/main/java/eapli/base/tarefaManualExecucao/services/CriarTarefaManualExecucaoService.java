package eapli.base.tarefaManualExecucao.services;

import eapli.base.Utils.bibliotecaTarefa.TiposDeTarefa;
import eapli.base.atividadeRealizacao.domain.AtividadeRealizacao;
import eapli.base.atividadeRealizacao.domain.TipoExecucao;
import eapli.base.atividadeRealizacao.persistence.AtividadeRealizacaoRepositorio;
import eapli.base.equipa.domain.Equipa;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servico.domain.Servico;
import eapli.base.tarefaAutomatica.domain.TarefaAutomatica;
import eapli.base.tarefaAutomatica.persistance.TarefaAutomaticaRepositorio;
import eapli.base.tarefaManualExecucao.domain.EstadoRealizacao;
import eapli.base.tarefaManualExecucao.domain.TarefaManualExecucao;
import eapli.base.tarefaManualExecucao.persistance.TarefaManualExecucaoRepositorio;
import eapli.base.ticket.domain.Ticket;


public class CriarTarefaManualExecucaoService {

    private final AtividadeRealizacaoRepositorio atividadeRealizacaoRepositorio = PersistenceContext.repositories().atividadeRealizacaoRepositorio();
    private final TarefaManualExecucaoRepositorio tarefaManualExecucaoRep = PersistenceContext.repositories().tarefaManualExecucaoRepositorio();
    private final TarefaAutomaticaRepositorio tarefaAutomaticaRepositorio = PersistenceContext.repositories().tarefaAutomaticaRepositorio();
    private final TiposDeTarefa tiposDeTarefa = new TiposDeTarefa();

    public CriarTarefaManualExecucaoService(){}

        public void criarTarefaExecucao(Servico s, Ticket ticket) {
            AtividadeRealizacao ar = s.fluxoDoServico().ativRealizacaoDoFluxo();

            if (ar.tipoExecucao() == TipoExecucao.MANUAL) {
                if (!ar.equipasExecucao().isEmpty()) {
                    TarefaManualExecucao tme = tiposDeTarefa().novaTarefaManualExecucaoEquipa(ticket, ar.equipasExecucao());
                    for (Equipa equipa : ar.equipasExecucao()) {
                        tme.adicionaEquipaExecucao(equipa);
                    }
                    TarefaManualExecucao tarManExec = tarefaManualExecucaoRep.save(tme);
                    ar.adicionarTarefaExecucao(tarManExec);

                } else if (ar.colabExec() != null) {
                    TarefaManualExecucao tarManExec = tarefaManualExecucaoRep.save(tiposDeTarefa().
                            novaTarefaManualExecucaoColaborador(ticket, ar.colabExec(), EstadoRealizacao.POR_EXECUTAR));
                    ar.adicionarTarefaExecucao(tarManExec);
                }
            } else {
                TarefaAutomatica tarefaAutomatica = tiposDeTarefa().novaTarefaAutomatica(ticket, ar.scriptAutomatico());
                TarefaAutomatica tarAut = tarefaAutomaticaRepositorio.save(tarefaAutomatica);
                ar.adicionarTarefaAutomatica(tarAut);
            }
            atividadeRealizacaoRepositorio.save(ar);
        }

    public TiposDeTarefa tiposDeTarefa(){
        return tiposDeTarefa;
    }
}
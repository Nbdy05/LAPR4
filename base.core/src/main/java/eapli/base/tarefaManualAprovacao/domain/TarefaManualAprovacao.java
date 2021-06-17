package eapli.base.tarefaManualAprovacao.domain;

import eapli.base.atividadeAprovacao.domain.AtividadeAprovacao;
import eapli.base.colaborador.domain.Colaborador;
import eapli.base.ticket.domain.Ticket;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.time.util.Calendars;
import javax.persistence.*;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity
public class TarefaManualAprovacao implements AggregateRoot<Long>, Comparable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Ticket ticket;

    @ManyToMany
    private Set<Colaborador> colabsAprova;

    @Enumerated(EnumType.STRING)
    private EstadoAprovacao estadoAprovacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAprovado;

    @OneToOne
    private AtividadeAprovacao atividadeAprovacao;

    public TarefaManualAprovacao(Ticket ticket, AtividadeAprovacao atividadeAprovacao){
        this.ticket = ticket;
        this.estadoAprovacao = EstadoAprovacao.POR_APROVAR;
        this.atividadeAprovacao = atividadeAprovacao;
        colabsAprova = new HashSet<>();
    }

    protected TarefaManualAprovacao(){}

    public Ticket ticketDaTarefa(){
        return ticket;
    }

    public void assignaColabAprovacao(Colaborador colaborador){
        colabsAprova.add(colaborador);
    }

    public Calendar dataDecisaoAprovacao(){
        return dataAprovado;
    }

    public void definirMomentoAprovacao(){
        dataAprovado = Calendars.now();
    }

    public EstadoAprovacao estadoAprov() { return estadoAprovacao; }

    public AtividadeAprovacao atividadeAprovacaoDaTarefa(){
        return atividadeAprovacao;
    }

    public void aprovado(){
        this.estadoAprovacao = EstadoAprovacao.APROVADO;
    }
    public void rejeitado(){
        this.estadoAprovacao = EstadoAprovacao.REJEITADO;
    }

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public Long identity() {
        return id;
    }

    @Override
    public String toString() {
        return
                " - "+ "   "+
                  ticket +
                "   Estado de Aprovacao : " + this.estadoAprovacao.toString();

    }
}


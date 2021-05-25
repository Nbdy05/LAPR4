package eapli.base.tarefa.domain;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TarefaAutomatica extends TarefaExecucao implements AggregateRoot<TarefaAutomatica>, Comparable<TarefaAutomatica>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //TODO VER COMO FAZER ISTO OU COMO FUNCIONA OU LA O QUE ISTO É


    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public TarefaAutomatica identity() {
        return this;
    }
}
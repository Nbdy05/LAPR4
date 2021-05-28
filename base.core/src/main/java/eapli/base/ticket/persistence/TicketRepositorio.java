package eapli.base.ticket.persistence;

import eapli.base.catalogo.domain.Catalogo;
import eapli.base.servico.domain.Servico;
import eapli.base.servico.domain.ServicoIdentificador;
import eapli.base.ticket.domain.Ticket;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;

public interface TicketRepositorio extends DomainRepository<Long, Ticket> {

}
package eapli.base.equipa.persistencia;

import eapli.base.catalogo.domain.Catalogo;
import eapli.base.equipa.domain.CodigoEquipa;
import eapli.base.equipa.domain.Equipa;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Collection;
import java.util.List;

public interface EquipaRepositorio extends DomainRepository<CodigoEquipa, Equipa > {

    Equipa findByKeyword(String keyword);

    List<Equipa> listarAcronimosEquipa(String keyword);

    Iterable<Catalogo> catalogosPorEquipa(Equipa equipa);

    Iterable<Catalogo> catalogosPorEquipaPorTitulo(final Equipa eq, final String titulo);

    Iterable<Catalogo> catalogosPorEquipaPorDescBreve(final Equipa eq, final String descBreve);
}
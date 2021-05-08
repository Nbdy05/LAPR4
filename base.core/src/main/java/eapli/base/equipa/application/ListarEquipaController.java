package eapli.base.equipa.application;

import eapli.base.equipa.domain.Acronimo;
import eapli.base.equipa.domain.Equipa;
import eapli.base.equipa.persistencia.EquipaRepositorio;
import eapli.base.infrastructure.persistence.PersistenceContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListarEquipaController {
    private final EquipaRepositorio repoEquipa = PersistenceContext.repositories().equipaRepositorio();

    /**
     * Listar todas as equipas da base de dados
     */

    public List<Equipa> listarEquipa(){
        return (List<Equipa>) repoEquipa.findAll();
    }



}

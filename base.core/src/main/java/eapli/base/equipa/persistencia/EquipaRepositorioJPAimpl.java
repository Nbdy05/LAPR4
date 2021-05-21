package eapli.base.equipa.persistencia;

import eapli.base.Application;
import eapli.base.Utils.QueryMaker;
import eapli.base.catalogo.domain.Catalogo;
import eapli.base.colaborador.domain.Colaborador;
import eapli.base.equipa.domain.CodigoEquipa;
import eapli.base.equipa.domain.Equipa;
import eapli.base.servico.domain.DescricaoBreve;
import eapli.base.servico.domain.Servico;
import eapli.base.servico.domain.Titulo;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.*;
import java.util.List;


public class EquipaRepositorioJPAimpl extends JpaAutoTxRepository<Equipa, Long, CodigoEquipa>
        implements EquipaRepositorio{

    public EquipaRepositorioJPAimpl(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "eapli.base");
    }

    @Override
    public Equipa findByKeyword(String keyword) {
        return null;
    }

    public List<Equipa> listarAcronimosEquipa(String acrText){
        /*
        EntityManager manager = new JpaRepository();

        Query equipas = manager.createQuery("select e from equipa e");
        List<Equipa> results = (List<Equipa>) equipas;

        System.out.println(results);
        return null;*/
        return null;
    }

    public Iterable<Equipa> equipasDoCatalogo(Catalogo catalogo){
        QueryMaker qm = new QueryMaker();
        Query query = qm.criarEntityManager("eapli.base").createQuery("SELECT c.equipas FROM Catalogo c where c = :catalogo",
                Iterable.class);
        query.setParameter("catalogo", catalogo);
        return query.getResultList();
    }
}

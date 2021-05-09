package eapli.base.equipa.domain;

import eapli.base.catalogo.domain.Catalogo;
import eapli.base.colaborador.domain.Colaborador;
import eapli.base.tipoEquipa.domain.TipoEquipa;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Equipa implements Comparable<Equipa>, AggregateRoot<Equipa> {

    /**
     *
     *  Identificador único da Equipa
     */
    @Id
    @Column(name="ID")
    private CodigoEquipa codigoEquipa;

    @OneToOne
    private TipoEquipa tipoEquipa;

    /**
     * Acrónimo Único da Equipa
     */
    @Column(unique = true)
    private Acronimo acr;

    /**
     * Designação da Equipa
     */
    private String designacao;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="EQUIPA_RESPONSAVEL")
    private Set<Colaborador> listaColabsResponsaveis;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalogoId")
    private Catalogo catalogo;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="EQUIPA_COLABORADOR")
    private Set<Colaborador> listaColabs;

    /**
     *
     * @param codigoEquipa codigo da equipa obrigatório no construtor
     * @param acr acrónimo da equipa obrigatório no construtor
     * @param designacao designação da equipa obrigatório no construtor
     */

    public Equipa(CodigoEquipa codigoEquipa, Acronimo acr, String designacao, Set<Colaborador> colabR, TipoEquipa tipoEquipa) {
        this.codigoEquipa = codigoEquipa;
        this.acr = acr;
        this.designacao = designacao;
        this.listaColabsResponsaveis = colabR;
        this.tipoEquipa = tipoEquipa;
    }

    /**
     * Contrutor vazio obrigatório pela framework de JPA
     */
    public Equipa() {}

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public int compareTo(Equipa other) {
        return 0;
    }

    @Override
    public Equipa identity() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("Código Equipa: %d Acrónimo: %s Designação: %s",
                this.codigoEquipa, this.acr, this.designacao);
    }

}

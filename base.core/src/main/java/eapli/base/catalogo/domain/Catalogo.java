package eapli.base.catalogo.domain;

import eapli.base.colaborador.domain.Colaborador;
import eapli.base.equipa.domain.Equipa;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Catalogo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String titulo;
    /**
     * Descrição brece do serviço
     */
    @Column
    private String descBreve;
    /**
     * Descrição completa do serviço
     */
    @Column
    private String descComp;
    /**
     * Ícone do serviço
     */
    @Column
    private int icon; //TODO alterar para imagem

    @OneToOne
    private Colaborador colaboradorResponsavel;

    //TODO ONE TO MANY, UM CATALOGO DA ACESSO A MUITAS EQUIPAS

    @OneToMany
    private Set<Equipa> equipa;

    protected Catalogo(){}

    public Catalogo(Long id, String titulo, String descBreve, String descComp, int icon, Colaborador colaboradorResponsavel) {
        this.id = id;
        this.titulo = titulo;
        this.descBreve = descBreve;
        this.descComp = descComp;
        this.icon = icon;
        this.colaboradorResponsavel = colaboradorResponsavel;
    }
}

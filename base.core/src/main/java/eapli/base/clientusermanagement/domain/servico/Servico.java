package eapli.base.clientusermanagement.domain.servico;

import javax.persistence.*;
import java.util.Set;

/**
 * Classe da Entidade Serviço
 */
@Entity
@Table
public class Servico {

    /**
     * Titulo do Servico
     */
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
    int icon; //TODO alterar para imagem
    /**
     * Modo de atividade de aprovação, podendo ser requerida ou não
     */
    @Column
    private String atAprov;
    /**
     * Atividade de realização, podendo ser automática ou manual
     */
    @Column
    private String atReal;
    /**
     * Estado de conclusão do serviço, podendo estar completo ou incompleto
     */
    @Column
    private String estado;

    /**
     * Conjunto de palavras chave de um serviço
     */
    @ElementCollection
    private Set<Keyword> keywords;
    /**
     * Identificador único do Serviço
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Construtor da entidade Servico
     * @param titulo do Servico
     * @param descBreve descrição breve do serviço
     * @param descComp descrição completa do serviço
     * @param icon ícone associado
     * @param atAprov atividade de aprovação, podendo ser requerida ou não
     * @param atReal atividade de realização, podendo ser automática ou manual
     * @param estado estado de conclusão do serviço, podendo estar completo ou incompleto
     */
    public Servico(String titulo, String descBreve, String descComp, int icon, String atAprov, String atReal, String estado, Set<Keyword> keywords){
        this.titulo = titulo;
        this.descBreve = descBreve;
        this.descComp = descComp;
        this.icon = icon;
        this.atAprov = atAprov;
        this.atReal = atReal;
        this.estado = estado;
        this.keywords = keywords;
    }
/**
 * Construtor vazio requerido da entidade Servico
 */
    public Servico(){}
}

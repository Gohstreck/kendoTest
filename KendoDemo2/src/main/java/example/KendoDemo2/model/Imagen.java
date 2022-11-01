package example.KendoDemo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Imagen")
public class Imagen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    
    @Column(nullable = false)
    private String photoString;

    @Column(nullable = false)
    private boolean iconoOAviso; // Si es icono (0), es una chica, si es aviso (1) es grande.

    @ManyToOne()
    @JoinColumn(name="torneoId", referencedColumnName = "id")
    private Torneo torneo;

    @ManyToOne()
    @JoinColumn(name="dojoId", referencedColumnName = "id")
    private Dojo dojo;

    @ManyToOne()
    @JoinColumn(name="userId", referencedColumnName = "id")
    private Usuario user;
    
}

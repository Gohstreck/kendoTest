package example.KendoDemo2.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;


@Entity
public class GanadorTorneoCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;


    @ManyToOne()
    @JoinColumn(name="torneoId", referencedColumnName = "id")
    private Torneo torneo;


    @OneToOne()
    @JoinColumn(name="categoriaId", referencedColumnName = "id")
    private Categoria categoria;


    @OneToOne()
    @JoinColumn(name ="premioId", referencedColumnName = "id")
    private Premio premio;

    @ManyToOne()
    @JoinColumn(name ="usuarioId", referencedColumnName = "id")
    private Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public GanadorTorneoCategoria(int id, Torneo torneo, Categoria categoria, Premio premio, Usuario usuario) {
        this.id = id;
        this.torneo = torneo;
        this.categoria = categoria;
        this.premio = premio;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "GanadorTorneoCategoria [id=" + id + ", torneo=" + torneo + ", categoria=" + categoria + ", premio="
                + premio + ", usuario=" + usuario + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((torneo == null) ? 0 : torneo.hashCode());
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result + ((premio == null) ? 0 : premio.hashCode());
        result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GanadorTorneoCategoria other = (GanadorTorneoCategoria) obj;
        if (id != other.id)
            return false;
        if (torneo == null) {
            if (other.torneo != null)
                return false;
        } else if (!torneo.equals(other.torneo))
            return false;
        if (categoria == null) {
            if (other.categoria != null)
                return false;
        } else if (!categoria.equals(other.categoria))
            return false;
        if (premio == null) {
            if (other.premio != null)
                return false;
        } else if (!premio.equals(other.premio))
            return false;
        if (usuario == null) {
            if (other.usuario != null)
                return false;
        } else if (!usuario.equals(other.usuario))
            return false;
        return true;
    }
    






    
     
}

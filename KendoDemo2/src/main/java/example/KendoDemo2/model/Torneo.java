package example.KendoDemo2.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;
@Entity
public class Torneo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    int id;

    String nombre, edicion;

    @OneToMany(mappedBy = "torneo")
    List<Categoria> categorias;
 

    @OneToMany(mappedBy = "torneo")
    private List<GanadorTorneoCategoria> ganadorTorneoCategoria;
    
    Date inicio, fin;


    private int iconoId;

    @OneToMany(mappedBy = "torneo")
    private List<Imagen> avisos;

    @ManyToOne()
    @JoinColumn(name = "dojoId")
    Dojo dojo;

    
    
    public Torneo(String nombre, String edicion, List<Categoria> categorias,
            List<GanadorTorneoCategoria> ganadorTorneoCategoria, Date inicio, Date fin, int iconoId,
            List<Imagen> avisos, Dojo dojo) {
        this.nombre = nombre;
        this.edicion = edicion;
        this.categorias = categorias;
        this.ganadorTorneoCategoria = ganadorTorneoCategoria;
        this.inicio = inicio;
        this.fin = fin;
        this.iconoId = iconoId;
        this.avisos = avisos;
        this.dojo = dojo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((edicion == null) ? 0 : edicion.hashCode());
        result = prime * result + ((categorias == null) ? 0 : categorias.hashCode());
        result = prime * result + ((ganadorTorneoCategoria == null) ? 0 : ganadorTorneoCategoria.hashCode());
        result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
        result = prime * result + ((fin == null) ? 0 : fin.hashCode());
        result = prime * result + iconoId;
        result = prime * result + ((avisos == null) ? 0 : avisos.hashCode());
        result = prime * result + ((dojo == null) ? 0 : dojo.hashCode());
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
        Torneo other = (Torneo) obj;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edicion == null) {
            if (other.edicion != null)
                return false;
        } else if (!edicion.equals(other.edicion))
            return false;
        if (categorias == null) {
            if (other.categorias != null)
                return false;
        } else if (!categorias.equals(other.categorias))
            return false;
        if (ganadorTorneoCategoria == null) {
            if (other.ganadorTorneoCategoria != null)
                return false;
        } else if (!ganadorTorneoCategoria.equals(other.ganadorTorneoCategoria))
            return false;
        if (inicio == null) {
            if (other.inicio != null)
                return false;
        } else if (!inicio.equals(other.inicio))
            return false;
        if (fin == null) {
            if (other.fin != null)
                return false;
        } else if (!fin.equals(other.fin))
            return false;
        if (iconoId != other.iconoId)
            return false;
        if (avisos == null) {
            if (other.avisos != null)
                return false;
        } else if (!avisos.equals(other.avisos))
            return false;
        if (dojo == null) {
            if (other.dojo != null)
                return false;
        } else if (!dojo.equals(other.dojo))
            return false;
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<GanadorTorneoCategoria> getGanadorTorneoCategoria() {
        return ganadorTorneoCategoria;
    }

    public void setGanadorTorneoCategoria(List<GanadorTorneoCategoria> ganadorTorneoCategoria) {
        this.ganadorTorneoCategoria = ganadorTorneoCategoria;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public int getIconoId() {
        return iconoId;
    }

    public void setIconoId(int iconoId) {
        this.iconoId = iconoId;
    }

    public List<Imagen> getAvisos() {
        return avisos;
    }

    public void setAvisos(List<Imagen> avisos) {
        this.avisos = avisos;
    }

    public Dojo getDojo() {
        return dojo;
    }

    public void setDojo(Dojo dojo) {
        this.dojo = dojo;
    }

    public Torneo() {
    }
    





    
}


package example.KendoDemo2.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    List<GanadorTorneoCategoria> ganadorTorneoCategoria;
    
    Date inicio, fin;

    List<String> fotosList;

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

    public List<String> getFotosList() {
        return fotosList;
    }

    public void setFotosList(List<String> fotosList) {
        this.fotosList = fotosList;
    }

    public Torneo(int id, String nombre, String edicion, List<Categoria> categorias,
            List<GanadorTorneoCategoria> ganadorTorneoCategoria, Date inicio, Date fin, List<String> fotosList) {
        this.id = id;
        this.nombre = nombre;
        this.edicion = edicion;
        this.categorias = categorias;
        this.ganadorTorneoCategoria = ganadorTorneoCategoria;
        this.inicio = inicio;
        this.fin = fin;
        this.fotosList = fotosList;
    }

    @Override
    public String toString() {
        return "Torneo [id=" + id + ", nombre=" + nombre + ", edicion=" + edicion + ", categorias=" + categorias
                + ", ganadorTorneoCategoria=" + ganadorTorneoCategoria + ", inicio=" + inicio + ", fin=" + fin
                + ", fotosList=" + fotosList + "]";
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
        result = prime * result + ((fotosList == null) ? 0 : fotosList.hashCode());
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
        if (fotosList == null) {
            if (other.fotosList != null)
                return false;
        } else if (!fotosList.equals(other.fotosList))
            return false;
        return true;
    }


    
    




    
}


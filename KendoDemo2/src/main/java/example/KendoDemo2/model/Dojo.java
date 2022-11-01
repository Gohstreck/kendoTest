package example.KendoDemo2.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Dojo")
public class Dojo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    
    private String nombre, telefono, municipio, colonia, calle, numeroCalle;

    float latitud, longitud;
    

    @ManyToOne( optional = false, fetch = FetchType.EAGER)
    Estado estado;

    
    @OneToMany(mappedBy = "dojo")
    private List<Torneo> torneos;


    
    public Dojo() {
    }

    public Dojo(int id, String nombre, String telefono, String municipio, String colonia, String calle,
            String numeroCalle, float latitud, float longitud, Estado estado, List<Torneo> torneos) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.municipio = municipio;
        this.colonia = colonia;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.latitud = latitud;
        this.longitud = longitud;
        this.estado = estado;
        this.torneos = torneos;
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
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public float getLatitud() {
        return latitud;
    }
    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }
    public float getLongitud() {
        return longitud;
    }
    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNumeroCalle() {
        return numeroCalle;
    }
    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((calle == null) ? 0 : calle.hashCode());
        result = prime * result + ((colonia == null) ? 0 : colonia.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + id;
        result = prime * result + ((municipio == null) ? 0 : municipio.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((numeroCalle == null) ? 0 : numeroCalle.hashCode());
        result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
        Dojo other = (Dojo) obj;
        if (calle == null) {
            if (other.calle != null)
                return false;
        } else if (!calle.equals(other.calle))
            return false;
        if (colonia == null) {
            if (other.colonia != null)
                return false;
        } else if (!colonia.equals(other.colonia))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (id != other.id)
            return false;
        if (municipio == null) {
            if (other.municipio != null)
                return false;
        } else if (!municipio.equals(other.municipio))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (numeroCalle == null) {
            if (other.numeroCalle != null)
                return false;
        } else if (!numeroCalle.equals(other.numeroCalle))
            return false;
        if (telefono == null) {
            if (other.telefono != null)
                return false;
        } else if (!telefono.equals(other.telefono))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Dojo [calle=" + calle + ", colonia=" + colonia + ", estado=" + estado + ", id=" + id + ", municipio="
                + municipio + ", nombre=" + nombre + ", numeroCalle=" + numeroCalle + ", telefono=" + telefono + "]";
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public List<Torneo> getTorneos() {
        return torneos;
    }
    public void setTorneos(List<Torneo> torneos) {
        this.torneos = torneos;
    }
    
    
    
}

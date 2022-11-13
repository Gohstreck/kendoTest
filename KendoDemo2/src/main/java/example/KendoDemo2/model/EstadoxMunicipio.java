package example.KendoDemo2.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import example.KendoDemo2.model.compoundKeysClasses.EstadoMunicipioId;



@Entity
@Table(name="EstadoXMunicipio")
@IdClass(EstadoMunicipioId.class)
public class EstadoxMunicipio {


    @Id
    private int id;
    
    @Id
    private int estadoId;
    @Id
    private int municipioId;

    
    private String estadoNombre;

    private String municipioNombre;




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + estadoId;
        result = prime * result + municipioId;
        result = prime * result + ((estadoNombre == null) ? 0 : estadoNombre.hashCode());
        result = prime * result + ((municipioNombre == null) ? 0 : municipioNombre.hashCode());
        return result;
    }


    @Override
    public String toString() {
        return "EstadoxMunicipio [id=" + id + ", estadoId=" + estadoId + ", municipioId=" + municipioId
                + ", estadoNombre=" + estadoNombre + ", municipioNombre=" + municipioNombre + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EstadoxMunicipio other = (EstadoxMunicipio) obj;
        if (id != other.id)
            return false;
        if (estadoId != other.estadoId)
            return false;
        if (municipioId != other.municipioId)
            return false;
        if (estadoNombre == null) {
            if (other.estadoNombre != null)
                return false;
        } else if (!estadoNombre.equals(other.estadoNombre))
            return false;
        if (municipioNombre == null) {
            if (other.municipioNombre != null)
                return false;
        } else if (!municipioNombre.equals(other.municipioNombre))
            return false;
        return true;
    }


    public String getEstadoNombre() {
        return estadoNombre;
    }


    public void setEstadoNombre(String estadoNombre) {
        this.estadoNombre = estadoNombre;
    }


    public String getMunicipioNombre() {
        return municipioNombre;
    }


    public void setMunicipioNombre(String municipioNombre) {
        this.municipioNombre = municipioNombre;
    }


    public EstadoxMunicipio() {
    }


    public int getEstadoId() {
        return estadoId;
    }


    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }


    public int getMunicipioId() {
        return municipioId;
    }


    public void setMunicipioId(int municipioId) {
        this.municipioId = municipioId;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    
}

package example.KendoDemo2.model.compoundKeysClasses;

import java.io.Serializable;

public class EstadoMunicipioId  implements Serializable{
    private int id, estadoId, municipioId;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + estadoId;
        result = prime * result + municipioId;
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
        EstadoMunicipioId other = (EstadoMunicipioId) obj;
        if (estadoId != other.estadoId)
            return false;
        if (municipioId != other.municipioId)
            return false;
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}

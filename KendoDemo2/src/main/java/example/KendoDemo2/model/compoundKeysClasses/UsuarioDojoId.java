package example.KendoDemo2.model.compoundKeysClasses;

import java.io.Serializable;

public class UsuarioDojoId implements Serializable{
    private int idUser, idDojo;
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idUser;
        result = prime * result + idDojo;
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
        UsuarioDojoId other = (UsuarioDojoId) obj;
        if (idUser != other.idUser)
            return false;
        if (idDojo != other.idDojo)
            return false;
        return true;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdDojo() {
        return idDojo;
    }

    public void setIdDojo(int idDojo) {
        this.idDojo = idDojo;
    }
    
}

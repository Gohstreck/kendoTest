package example.KendoDemo2.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import example.KendoDemo2.model.compoundKeysClasses.UsuarioDojoId;

@Entity
@Table(name = "UsuarioxDojo")
@IdClass(UsuarioDojoId.class)
public class UsuarioxDojo {
    
    @Id
    private int idUser;

    @Id 
    private int idDojo;
    
    public int getidUser() {
        return idUser;
    }
    public void setidUser(int idUser) {
        this.idUser = idUser;
    }
    public int getidDojo() {
        return idDojo;
    }
    public void setidDojo(int idDojo) {
        this.idDojo = idDojo;
    }
    public UsuarioxDojo(int idUser, int idDojo) {
        this.idUser = idUser;
        this.idDojo = idDojo;
    }
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
        UsuarioxDojo other = (UsuarioxDojo) obj;
        if (idUser != other.idUser)
            return false;
        if (idDojo != other.idDojo)
            return false;
        return true;
    }
    public UsuarioxDojo() {

    }

    
}

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
    private int userId;
    @Id 
    private int dojoId;
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getDojoId() {
        return dojoId;
    }
    public void setDojoId(int dojoId) {
        this.dojoId = dojoId;
    }
    public UsuarioxDojo(int userId, int dojoId) {
        this.userId = userId;
        this.dojoId = dojoId;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + userId;
        result = prime * result + dojoId;
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
        if (userId != other.userId)
            return false;
        if (dojoId != other.dojoId)
            return false;
        return true;
    }

    
}

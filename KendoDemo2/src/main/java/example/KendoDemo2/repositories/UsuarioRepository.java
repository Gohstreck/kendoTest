package example.KendoDemo2.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import example.KendoDemo2.model.Usuario;


@Repository
public interface UsuarioRepository  extends CrudRepository<Usuario, Integer>{
    
    /**
     * Busca un usuario en la base de datos y lo devuelve si existe
     * @param correo El correo del usuario
     * @param password Su password antes del hash
     * @return El usuario especificado. null si no existe.
     */
    List<Usuario> findByCorreoAndPassword(String correo, String password);

        
    /**
     * Busca si existe un correo dentro de la base de datos.
     * @param correo El correo del usuario

     * @return El usuario especificado. null si no existe.
     */
    List<Usuario> findByCorreo(String correo);
}
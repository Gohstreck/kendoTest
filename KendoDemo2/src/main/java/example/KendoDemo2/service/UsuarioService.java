package example.KendoDemo2.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import example.KendoDemo2.model.Usuario;

import example.KendoDemo2.repositories.UsuarioRepository;


@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    final private String salt = "SUPONIERA";

    public ArrayList<Usuario> getUsuarios(){
        return (ArrayList<Usuario>)usuarioRepository.findAll();
    }

    /**
     * Guarda el usuario en la base de datos. Hashea su password.
     * @param user El usuario a guardar.
     * @return El usuario guardado.
     * @throws SQLIntegrityConstraintViolationException En caso de que el correo este repetido.
     */

    public Usuario save(Usuario user) throws SQLIntegrityConstraintViolationException{
        String hashed = Encoder.encode(user.getPassword() + salt);
        user.setPassword(hashed);
        return (Usuario) usuarioRepository.save(user);
    }

    /**
     * Revisa si las credenciales son autenticas.
     * @param user El usuario a revisar.
     * @return true si las credenciales son correctas, false en caso de que no.
     */
    public boolean isCorrect(Usuario user){
        String hashed = Encoder.encode(user.getPassword() + salt);
        ArrayList<Usuario> u = (ArrayList<Usuario>) usuarioRepository.findByCorreoAndPassword(user.getCorreo(), hashed);
        if (u.isEmpty() || u == null) {
           return false; 
        }
        return true;
    }


    public boolean exists(Usuario user){
        if (usuarioRepository.findByCorreo(user.getCorreo()).size() != 0) {
            return true;
        };
        return false;
    }


}
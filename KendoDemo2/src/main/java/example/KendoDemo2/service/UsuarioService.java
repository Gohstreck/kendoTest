package example.KendoDemo2.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import example.KendoDemo2.model.Usuario;
import example.KendoDemo2.repositories.UsuarioRepository;
import example.KendoDemo2.repositories.UsuarioRepositoryInterface;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuario> getUsuarios(){
        return (ArrayList<Usuario>)usuarioRepository.findAll();
    }

    public Usuario save(Usuario user){
        Usuario userAux = user;
        String hashed = Encoder.encode(user.getPassword() + user.getNombre());

        userAux.setPassword(hashed);
        return (Usuario) usuarioRepository.save(user);
    }

    /**
     * Revisa si las credenciales son autenticas.
     * @param user El usuario a revisar.
     * @return true si las credenciales son correctas, false en caso de que no.
     */
    public boolean isCorrect(Usuario user){

        String hashed = Encoder.encode(user.getPassword() + user.getNombre());

        ArrayList<Usuario> u = (ArrayList<Usuario>) usuarioRepository.findByCorreoAndPassword(user.getCorreo(), hashed);
        if (u.isEmpty() || u == null) {
           return false; 
        }
        return true;
    }

    
}
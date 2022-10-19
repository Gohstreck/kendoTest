package example.KendoDemo2.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.KendoDemo2.model.Usuario;
import example.KendoDemo2.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuario> getUsuarios(){
        return (ArrayList<Usuario>)usuarioRepository.findAll();
    }

    public Usuario save(Usuario user){
        return (Usuario) usuarioRepository.save(user);
    }
}

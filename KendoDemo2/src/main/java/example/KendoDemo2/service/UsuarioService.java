package example.KendoDemo2.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.KendoDemo2.model.UsuarioModel;
import example.KendoDemo2.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getUsuarios(){
        return (ArrayList<UsuarioModel>)usuarioRepository.findAll();
    }

    public UsuarioModel save(UsuarioModel user){
        return (UsuarioModel) usuarioRepository.save(user);
    }
}

package example.KendoDemo2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.KendoDemo2.model.UsuarioModel;
import example.KendoDemo2.service.UsuarioService;

@RestController
@RequestMapping("/api/user/")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("get-all")
    public ArrayList<UsuarioModel> getAll(){
        return usuarioService.getUsuarios();
    }

    @PostMapping("save-user")
    public UsuarioModel save(@RequestBody UsuarioModel user){
        return usuarioService.save(user);
    }
}

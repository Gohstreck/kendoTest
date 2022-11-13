package example.KendoDemo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.KendoDemo2.model.Estado;
import example.KendoDemo2.service.EstadoService;

@RestController
@RequestMapping("/api/estado/")
public class EstadoController {
    @Autowired
    EstadoService estadoService;

    @GetMapping("get-all")
    public List<Estado> getAll(){
        return estadoService.getAll();
    }


}



package example.KendoDemo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.KendoDemo2.model.EstadoxMunicipio;
import example.KendoDemo2.model.Municipio;
import example.KendoDemo2.service.EstadoxMunicipioService;

@RestController
@RequestMapping("/api/municipio/")
public class EstadoxMunicipioController {
    
    @Autowired
    EstadoxMunicipioService municipioService;

    @GetMapping("get-all")
    public List<EstadoxMunicipio> getAll(){
        return municipioService.getAll();
    }

    @GetMapping("get-by-idEstado-hint")
    public List<EstadoxMunicipio> getByEstadoAndHint(@RequestParam int idEstado, @RequestParam String hint){
        return municipioService.getByEstadoAndHint(idEstado, hint);
    }

    @GetMapping("get-by-idEstado")
    public List<EstadoxMunicipio> getByEstado(@RequestBody EstadoxMunicipio idEstado){
        System.out.println(idEstado);
        return municipioService.getByEstado(idEstado.getEstadoId());
    }
}

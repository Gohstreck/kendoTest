package example.KendoDemo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.KendoDemo2.model.EstadoxMunicipio;
import example.KendoDemo2.repositories.EstadoxMunicipioRepository;

@Service
public class EstadoxMunicipioService {
    @Autowired
    EstadoxMunicipioRepository municipioRepository;
    
    public List<EstadoxMunicipio> getAll(){
        return (List<EstadoxMunicipio>) municipioRepository.findAll();
    }

    public List<EstadoxMunicipio> getByEstadoAndHint(int idEstado, String hint){
        return (List<EstadoxMunicipio>) municipioRepository.findByEstadoAndHint(idEstado, hint);
    }

    public List<EstadoxMunicipio> getByEstado(int idEstado){
        return (List<EstadoxMunicipio>) municipioRepository.findByEstado(idEstado);
    }
}

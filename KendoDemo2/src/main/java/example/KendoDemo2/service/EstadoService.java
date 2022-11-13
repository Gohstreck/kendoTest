package example.KendoDemo2.service;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.KendoDemo2.model.Estado;
import example.KendoDemo2.repositories.EstadoRepository;

@Service
public class EstadoService {
    @Autowired
    EstadoRepository estadoRepository;
    
    public List<Estado> getAll(){
        return (List<Estado>) estadoRepository.findAll();
    }

    

}

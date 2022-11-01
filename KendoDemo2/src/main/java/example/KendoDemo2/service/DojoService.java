package example.KendoDemo2.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.KendoDemo2.model.Dojo;
import example.KendoDemo2.repositories.DojoRepository;

@Service
public class DojoService {
    @Autowired
    DojoRepository dojoRepository;

    public ArrayList<Dojo> getDojos(){
        return (ArrayList<Dojo>) dojoRepository.findAll();
    }

    public Dojo save(Dojo dojo){
        return (Dojo) dojoRepository.save(dojo);
    }
}

package example.KendoDemo2.repositories;

import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;


import example.KendoDemo2.model.Municipio;

@Repository
public interface MunicipioRepository  extends CrudRepository<Municipio, Integer> {
    
}

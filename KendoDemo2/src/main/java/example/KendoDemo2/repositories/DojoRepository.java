package example.KendoDemo2.repositories;

import org.springframework.stereotype.Repository;

import example.KendoDemo2.model.Dojo;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Integer>{
    

}

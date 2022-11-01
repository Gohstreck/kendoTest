package example.KendoDemo2.repositories;

import org.springframework.stereotype.Repository;

import example.KendoDemo2.model.Torneo;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface TorneoRepository extends CrudRepository<Torneo, Integer>{
    
}

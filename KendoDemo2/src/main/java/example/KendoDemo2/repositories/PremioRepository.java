package example.KendoDemo2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import example.KendoDemo2.model.Premio;

@Repository
public interface PremioRepository  extends CrudRepository<Premio, Integer>{
    
}

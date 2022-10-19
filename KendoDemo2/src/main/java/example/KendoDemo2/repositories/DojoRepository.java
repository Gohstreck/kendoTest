package example.KendoDemo2.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface DojoRepository extends CrudRepository<DojoRepository, Long>{
    

}

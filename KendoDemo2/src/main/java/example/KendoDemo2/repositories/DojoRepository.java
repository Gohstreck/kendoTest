package example.KendoDemo2.repositories;

import org.springframework.stereotype.Repository;

import example.KendoDemo2.model.Dojo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Integer>{

    public final static String CAMPOS = "nombre, telefono, municipio, colonia, calle, numeroCalle, latitud, longitud";

    @Query(value = "SELECT " + CAMPOS +" FROM dojo WHERE region LIKE :region ORDER BY region", nativeQuery = true)
    ArrayList<Dojo> findByRegion(@Param("region")String region);
    

}

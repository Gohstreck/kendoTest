package example.KendoDemo2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import example.KendoDemo2.model.EstadoxMunicipio;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface EstadoxMunicipioRepository extends CrudRepository<EstadoxMunicipio, Integer> {
    

    public static final String query1 ="SELECT municipio.nombre FROM" +
    " municipio INNER JOIN estadoxmunicipio ON  municipio.id = estadoxmunicipio.municipio_id "+
    " INNER JOIN estado ON estadoxmunicipio.estado_id = estado.id WHERE estadoxmunicipio.estado_id = :edo AND municipio.nombre LIKE :municipio";

    @Query(value = query1, nativeQuery = true)
    List<EstadoxMunicipio> findByEstadoAndHint(@Param("edo") int edo, @Param("municipio") String municipio);
    

    /**
     * select municipio.id,estadoxmunicipio.estado_id, estado.nombre, municipio.nombre from
     * municipio INNER JOIN estadoxmunicipio ON municipio.id = estadoxmunicipio.municipio_id 
     * INNER JOIN estado ON estadoxmunicipio.estado_id = estado.id
     * where estado.id = 10;



     
    "SELECT municipio.nombre FROM" +
    " municipio INNER JOIN estadoxmunicipio ON  municipio.id = estadoxmunicipio.municipio_id "+
    " INNER JOIN estado ON estadoxmunicipio.estado_id = estado.id WHERE estadoxmunicipio.estado_id = :edo";


    
     */
    public static final String query2 = "select * from estadoxmunicipio where estadoxmunicipio.estado_id = :edo ";
    @Query(value = query2, nativeQuery = true)
    List<EstadoxMunicipio> findByEstado(@Param("edo") int edo);
}

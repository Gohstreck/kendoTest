
package example.KendoDemo2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import example.KendoDemo2.model.Usuario;

@Repository
public interface UsuarioRepositoryInterface extends CrudRepository<Usuario, Integer>{


}
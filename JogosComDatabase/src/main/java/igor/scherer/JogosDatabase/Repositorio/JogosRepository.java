package igor.scherer.JogosDatabase.Repositorio;

import igor.scherer.JogosDatabase.Modelo.JogosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogosRepository extends CrudRepository<JogosEntity, Long> {
}

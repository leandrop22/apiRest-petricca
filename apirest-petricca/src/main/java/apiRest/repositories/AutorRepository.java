package apiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apiRest.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}

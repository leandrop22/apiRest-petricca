package apiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apiRest.entities.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
}

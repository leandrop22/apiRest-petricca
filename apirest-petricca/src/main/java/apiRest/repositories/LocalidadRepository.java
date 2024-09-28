package apiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apiRest.entities.Localidad;

@Repository
public interface LocalidadRepository extends JpaRepository<Localidad, Long> {
}

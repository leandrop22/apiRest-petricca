package apiRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apiRest.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}

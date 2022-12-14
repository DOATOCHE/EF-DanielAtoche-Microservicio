package ef.danielatoche.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ef.danielatoche.modelo.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer>{

}

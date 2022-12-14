package ef.danielatoche.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ef.danielatoche.modelo.TuristaDetalle;


@Repository
public interface DetalleTuristaRepository extends JpaRepository<TuristaDetalle, Integer> {

}

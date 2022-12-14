package ef.danielatoche.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ef.danielatoche.modelo.ReservaDetalle;

@Repository
public interface DetalleReservaRepository extends JpaRepository<ReservaDetalle, Integer> {

}

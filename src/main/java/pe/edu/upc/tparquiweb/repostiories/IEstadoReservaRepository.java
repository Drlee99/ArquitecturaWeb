package pe.edu.upc.tparquiweb.repostiories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tparquiweb.entities.EstadoReserva;

@Repository
public interface IEstadoReservaRepository extends JpaRepository<EstadoReserva, Integer> {
}

package pe.edu.upc.tparquiweb.repostiories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tparquiweb.entities.Reserva;

@Repository
public interface IReservaRepository extends JpaRepository<Reserva,Integer> {
}

package pe.edu.upc.tparquiweb.repostiories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.tparquiweb.entities.Ubicacion;

public interface IUbicacionRepository extends JpaRepository<Ubicacion, Integer> {
}

package pe.edu.upc.tparquiweb.repostiories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tparquiweb.entities.Agencia;

@Repository
public interface IAgenciaRepository extends JpaRepository<Agencia,Integer> {
}

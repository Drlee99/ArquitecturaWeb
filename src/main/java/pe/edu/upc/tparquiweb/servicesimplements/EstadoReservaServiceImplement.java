package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.EstadoReserva;
import pe.edu.upc.tparquiweb.repostiories.IEstadoReservaRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.IEstadoReservaService;

import java.util.List;
@Service
public class EstadoReservaServiceImplement implements IEstadoReservaService {
  @Autowired
  private IEstadoReservaRepository estadoReservaRepository;

  @Override
  public void add(EstadoReserva er) {
    estadoReservaRepository.save(er);
  }

  @Override
  public void update(EstadoReserva er) {
    estadoReservaRepository.save(er);
  }

  @Override
  public void delete(Integer id) {
    estadoReservaRepository.deleteById(id);
  }

  @Override
  public List<EstadoReserva> FindAll() {
    return estadoReservaRepository.findAll();
  }

  @Override
  public EstadoReserva FindById(Integer id) {
    return estadoReservaRepository.findById(id).orElse(null);
  }
}

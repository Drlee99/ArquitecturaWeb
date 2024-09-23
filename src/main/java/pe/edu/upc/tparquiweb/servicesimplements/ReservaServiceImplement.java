package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.Reserva;
import pe.edu.upc.tparquiweb.repostiories.IReservaRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.IReservaService;

import java.util.List;

@Service
public class ReservaServiceImplement implements IReservaService {
@Autowired
private IReservaRepository reservaRepository;

  @Override
  public void add(Reserva r) {
    reservaRepository.save(r);
  }

  @Override
  public void update(Reserva r) {
    reservaRepository.save(r);
  }

  @Override
  public void delete(Integer id) {
    reservaRepository.deleteById(id);
  }

  @Override
  public List<Reserva> FindAll() {
    return reservaRepository.findAll();
  }

  @Override
  public Reserva FindById(Integer id) {
    return reservaRepository.findById(id).orElse(null);
  }
}

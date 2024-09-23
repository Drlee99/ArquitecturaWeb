package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.Pago;
import pe.edu.upc.tparquiweb.repostiories.IPagoRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.IPagoService;

import java.util.List;

@Service
public class PagoServiceImplement implements IPagoService {
  @Autowired
  private IPagoRepository PagoRepository;

  @Override
  public void add(Pago p) {
    PagoRepository.save(p);
  }

  @Override
  public void update(Pago p) {
    PagoRepository.save(p);
  }

  @Override
  public void delete(Integer id) {
    PagoRepository.deleteById(id);
  }

  @Override
  public List<Pago> FindAll() {
    return PagoRepository.findAll();
  }

  @Override
  public Pago FindById(Integer id) {
    return PagoRepository.findById(id).orElse(null);
  }
}

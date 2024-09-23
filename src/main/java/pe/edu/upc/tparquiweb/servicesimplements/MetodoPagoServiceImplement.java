package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.MetodoPago;
import pe.edu.upc.tparquiweb.repostiories.IMetodoPagoRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.IMetodoPagoService;

import java.util.List;

@Service
public class MetodoPagoServiceImplement implements IMetodoPagoService {
  @Autowired
  private IMetodoPagoRepository metodoPagoRepository;
  @Override
  public void add(MetodoPago mp) {
    metodoPagoRepository.save(mp);
  }

  @Override
  public void update(MetodoPago mp) {
    metodoPagoRepository.save(mp);
  }

  @Override
  public void delete(Integer id) {
    metodoPagoRepository.deleteById(id);
  }

  @Override
  public List<MetodoPago> FindAll() {
    return metodoPagoRepository.findAll();
  }

  @Override
  public MetodoPago FindById(Integer id) {
    return metodoPagoRepository.findById(id).orElse(null);
  }
}

package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.Comprobante;
import pe.edu.upc.tparquiweb.repostiories.IComprobanteRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.IComprobanteService;

import java.util.List;

@Service
public class ComprobanteServiceImplement implements IComprobanteService {
  @Autowired
  private IComprobanteRepository comprobanteRepository;
  @Override
  public void add(Comprobante c) {
      comprobanteRepository.save(c);
  }
  @Override
  public void update(Comprobante c) {
      comprobanteRepository.save(c);
  }

  @Override
  public void delete(Integer id) {
      comprobanteRepository.deleteById(id);
  }

  @Override
  public List<Comprobante> FindAll() {
    return comprobanteRepository.findAll();
  }

  @Override
  public Comprobante FindById(Integer id) {
    return comprobanteRepository.findById(id).orElse(null);
  }
}

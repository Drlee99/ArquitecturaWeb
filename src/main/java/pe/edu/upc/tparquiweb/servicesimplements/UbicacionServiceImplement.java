package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.Ubicacion;
import pe.edu.upc.tparquiweb.repostiories.IUbicacionRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.IUbicacionService;

import java.util.List;

@Service
public class UbicacionServiceImplement implements IUbicacionService {
  @Autowired
  private IUbicacionRepository ubicacionRepository;

  @Override
  public void add(Ubicacion u) {
    ubicacionRepository.save(u);
  }

  @Override
  public void update(Ubicacion u) {
    ubicacionRepository.save(u);
  }

  @Override
  public void delete(Integer id) {
    ubicacionRepository.deleteById(id);
  }

  @Override
  public List<Ubicacion> FindAll() {
    return ubicacionRepository.findAll();
  }

  @Override
  public Ubicacion FindById(Integer id) {
    return ubicacionRepository.findById(id).orElse(null);
  }
}

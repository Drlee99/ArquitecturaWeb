package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.Rol;
import pe.edu.upc.tparquiweb.repostiories.IRolRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {
@Autowired
private IRolRepository rolRepository;

  @Override
  public void add(Rol r) {
    rolRepository.save(r);
  }

  @Override
  public void update(Rol r) {
    rolRepository.save(r);
  }

  @Override
  public void delete(Integer id) {
    rolRepository.deleteById(id);
  }

  @Override
  public List<Rol> FindAll() {
    return rolRepository.findAll();
  }

  @Override
  public Rol FindById(Integer id) {
    return rolRepository.findById(id).orElse(null);
  }
}

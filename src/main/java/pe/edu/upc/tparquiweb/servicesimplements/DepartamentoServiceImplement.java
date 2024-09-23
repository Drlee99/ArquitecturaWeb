package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.Departamento;
import pe.edu.upc.tparquiweb.repostiories.IComprobanteRepository;
import pe.edu.upc.tparquiweb.repostiories.IDepartamentoRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.IDepartamentoService;

import java.util.List;

@Service
public class DepartamentoServiceImplement implements IDepartamentoService {
  @Autowired
  private IDepartamentoRepository departamentoRepository;

  @Override
  public void add(Departamento d) {
    departamentoRepository.save(d);
  }

  @Override
  public void update(Departamento d) {
    departamentoRepository.save(d);
  }

  @Override
  public void delete(Integer id) {
    departamentoRepository.deleteById(id);
  }

  @Override
  public List<Departamento> FindAll() {
    return departamentoRepository.findAll();
  }

  @Override
  public Departamento FindById(Integer id) {
    return departamentoRepository.findById(id).orElse(null);
  }
}

package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.Agencia;
import pe.edu.upc.tparquiweb.repostiories.IAgenciaRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.IAgenciaService;

import java.util.List;

@Service
public class AgenciaServiceImplement implements IAgenciaService {
@Autowired
private IAgenciaRepository agenciaRepository;

  @Override
  public void add(Agencia a) {
    agenciaRepository.save(a);
  }

  @Override
  public void update(Agencia a) {
    agenciaRepository.save(a);
  }

  @Override
  public void delete(Integer id) {
    agenciaRepository.deleteById(id);
  }

  @Override
  public List<Agencia> FindAll() {
    return agenciaRepository.findAll();
  }

  @Override
  public Agencia FindById(Integer id) {
    return agenciaRepository.findById(id).orElse(null);
  }
}

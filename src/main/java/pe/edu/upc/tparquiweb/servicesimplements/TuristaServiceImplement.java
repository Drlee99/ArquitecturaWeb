package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.Turista;
import pe.edu.upc.tparquiweb.repostiories.ITuristaRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.ITuristaService;

import java.util.List;

@Service
public class TuristaServiceImplement implements ITuristaService {
  @Autowired
  private ITuristaRepository turistaRepository;

  @Override
  public void add(Turista t) {
    turistaRepository.save(t);
  }

  @Override
  public void update(Turista t) {
  turistaRepository.save(t);
  }

  @Override
  public void delete(Integer id) {
  turistaRepository.deleteById(id);
  }

  @Override
  public List<Turista> FindAll() {
    return turistaRepository.findAll();
  }

  @Override
  public Turista FindById(Integer id) {
    return turistaRepository.findById(id).orElse(null);
  }
}

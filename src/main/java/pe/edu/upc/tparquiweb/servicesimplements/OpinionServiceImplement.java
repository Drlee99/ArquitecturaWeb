package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.Opinion;
import pe.edu.upc.tparquiweb.repostiories.IOpinionRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.IOpinionService;

import java.util.List;

@Service
public class OpinionServiceImplement implements IOpinionService {
@Autowired
private IOpinionRepository opinionRepository;

  @Override
  public void add(Opinion o) {
    opinionRepository.save(o);
  }

  @Override
  public void update(Opinion o) {
    opinionRepository.save(o);
  }

  @Override
  public void delete(Integer id) {
    opinionRepository.deleteById(id);
  }

  @Override
  public List<Opinion> FindAll() {
    return opinionRepository.findAll();
  }

  @Override
  public Opinion FindById(Integer id) {
    return opinionRepository.findById(id).orElse(null);
  }
}

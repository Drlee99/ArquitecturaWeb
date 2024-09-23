package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.TipoTour;
import pe.edu.upc.tparquiweb.repostiories.ITipoTourRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.ITipoTourService;

import java.util.List;

@Service
public class TipoTourServiceImplement implements ITipoTourService {
  @Autowired
  private ITipoTourRepository tipoTourRepository;


  @Override
  public void add(TipoTour t) {
    tipoTourRepository.save(t);
  }

  @Override
  public void update(TipoTour t) {
  tipoTourRepository.save(t);
  }

  @Override
  public void delete(Integer id) {
   tipoTourRepository.deleteById(id);
  }

  @Override
  public List<TipoTour> FindAll() {
    return tipoTourRepository.findAll();
  }

  @Override
  public TipoTour FindById(Integer id) {
    return tipoTourRepository.findById(id).orElse(null);
  }
}

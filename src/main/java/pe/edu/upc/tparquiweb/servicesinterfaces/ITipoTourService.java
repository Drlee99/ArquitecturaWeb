package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.TipoTour;


import java.util.List;

public interface ITipoTourService {
  public void add(TipoTour t);
  public void update(TipoTour t);
  public void delete(Integer id);
  public List<TipoTour> FindAll();

  public TipoTour FindById(Integer id);
}

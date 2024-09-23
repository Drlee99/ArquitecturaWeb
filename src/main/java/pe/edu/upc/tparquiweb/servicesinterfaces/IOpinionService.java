package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.Opinion;

import java.util.List;

public interface IOpinionService {

  public void add(Opinion o);
  public void update(Opinion o);
  public void delete(Integer id);
  public List<Opinion> FindAll();

  public Opinion FindById(Integer id);

}

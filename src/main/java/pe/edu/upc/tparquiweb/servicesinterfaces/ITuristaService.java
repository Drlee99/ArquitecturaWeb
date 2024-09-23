package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.Turista;

import java.util.List;

public interface ITuristaService {

  public void add(Turista t);
  public void update(Turista t);
  public void delete(Integer id);
  public List<Turista> FindAll();

  public Turista FindById(Integer id);
}

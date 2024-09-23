package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.Ubicacion;

import java.util.List;

public interface IUbicacionService {
  public void add(Ubicacion u);
  public void update(Ubicacion u);
  public void delete(Integer id);
  public List<Ubicacion> FindAll();

  public Ubicacion FindById(Integer id);
}

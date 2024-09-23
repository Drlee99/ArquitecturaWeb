package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.Rol;


import java.util.List;

public interface IRolService {
  public void add(Rol r);
  public void update(Rol r);
  public void delete(Integer id);
  public List<Rol> FindAll();

  public Rol FindById(Integer id);
}

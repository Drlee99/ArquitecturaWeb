package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.Login;

import java.util.List;

public interface ILoginService {
  public void add(Login l);
  public void update(Login l);
  public void delete(Integer id);
  public List<Login> FindAll();

  public Login FindById(Integer id);
}

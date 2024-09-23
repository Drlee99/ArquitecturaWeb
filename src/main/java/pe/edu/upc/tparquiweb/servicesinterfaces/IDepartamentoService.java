package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.Departamento;

import java.util.List;

public interface IDepartamentoService {
  public void add(Departamento d);
  public void update(Departamento d);
  public void delete(Integer id);
  public List<Departamento> FindAll();

  public Departamento FindById(Integer id);
}

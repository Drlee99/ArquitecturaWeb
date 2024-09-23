package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.Agencia;

import java.util.List;

public interface IAgenciaService {

  public void add(Agencia a);
  public void update(Agencia a);
  public void delete(Integer id);
  public List<Agencia> FindAll();

  public Agencia FindById(Integer id);

}

package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.EstadoReserva;


import java.util.List;

public interface IEstadoReservaService {
  public void add(EstadoReserva er);
  public void update(EstadoReserva er);
  public void delete(Integer id);
  public List<EstadoReserva> FindAll();

  public EstadoReserva FindById(Integer id);
}

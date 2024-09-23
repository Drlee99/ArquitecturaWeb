package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.Reserva;

import java.util.List;

public interface IReservaService {

  public void add(Reserva r);
  public void update(Reserva r);
  public void delete(Integer id);
  public List<Reserva> FindAll();

  public Reserva FindById(Integer id);

}

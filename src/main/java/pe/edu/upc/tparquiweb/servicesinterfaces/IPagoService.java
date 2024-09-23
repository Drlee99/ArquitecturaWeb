package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.Pago;

import java.util.List;

public interface IPagoService {
  public void add(Pago p);
  public void update(Pago p);
  public void delete(Integer id);
  public List<Pago> FindAll();

  public Pago FindById(Integer id);

}

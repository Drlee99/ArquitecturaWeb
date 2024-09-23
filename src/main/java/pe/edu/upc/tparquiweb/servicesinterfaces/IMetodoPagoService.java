package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.MetodoPago;

import java.util.List;

public interface IMetodoPagoService {
  public void add(MetodoPago mp);
  public void update(MetodoPago mp);
  public void delete(Integer id);
  public List<MetodoPago> FindAll();

  public MetodoPago FindById(Integer id);
}

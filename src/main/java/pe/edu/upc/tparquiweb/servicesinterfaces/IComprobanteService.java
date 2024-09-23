package pe.edu.upc.tparquiweb.servicesinterfaces;

import pe.edu.upc.tparquiweb.entities.Comprobante;

import java.util.List;

public interface IComprobanteService {
  public void add(Comprobante c);
  public void update(Comprobante c);
  public void delete(Integer id);
  public List<Comprobante> FindAll();

  public Comprobante FindById(Integer id);
}

package pe.edu.upc.tparquiweb.dtos;

public class MetodoPagoDTO {
  private int idMetodoPago;
  private String nombreMetodoPago;

  public MetodoPagoDTO() {
  }

  public MetodoPagoDTO(int idMetodoPago, String nombreMetodoPago) {
    this.idMetodoPago = idMetodoPago;
    this.nombreMetodoPago = nombreMetodoPago;
  }

  public int getIdMetodoPago() {
    return idMetodoPago;
  }

  public void setIdMetodoPago(int idMetodoPago) {
    this.idMetodoPago = idMetodoPago;
  }

  public String getNombreMetodoPago() {
    return nombreMetodoPago;
  }

  public void setNombreMetodoPago(String nombreMetodoPago) {
    this.nombreMetodoPago = nombreMetodoPago;
  }
}

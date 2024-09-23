package pe.edu.upc.tparquiweb.dtos;

public class ComprobanteDTO {
  private int idComprobante;
  private String nombreComprobante;

  public ComprobanteDTO() {
  }

  public ComprobanteDTO(int idComprobante, String nombreComprobante) {
    this.idComprobante = idComprobante;
    this.nombreComprobante = nombreComprobante;
  }

  public int getIdComprobante() {
    return idComprobante;
  }

  public void setIdComprobante(int idComprobante) {
    this.idComprobante = idComprobante;
  }

  public String getNombreComprobante() {
    return nombreComprobante;
  }

  public void setNombreComprobante(String nombreComprobante) {
    this.nombreComprobante = nombreComprobante;
  }
}

package pe.edu.upc.tparquiweb.dtos;

public class EstadoReservaDTO {
  private int idEstadoReserva;
  private String descripcionEstadoReserva;

  public EstadoReservaDTO() {
  }

  public EstadoReservaDTO(int idEstadoReserva, String descripcionEstadoReserva) {
    this.idEstadoReserva = idEstadoReserva;
    this.descripcionEstadoReserva = descripcionEstadoReserva;
  }

  public int getIdEstadoReserva() {
    return idEstadoReserva;
  }

  public void setIdEstadoReserva(int idEstadoReserva) {
    this.idEstadoReserva = idEstadoReserva;
  }

  public String getDescripcionEstadoReserva() {
    return descripcionEstadoReserva;
  }

  public void setDescripcionEstadoReserva(String descripcionEstadoReserva) {
    this.descripcionEstadoReserva = descripcionEstadoReserva;
  }
}

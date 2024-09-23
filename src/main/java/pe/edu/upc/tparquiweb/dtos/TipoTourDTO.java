package pe.edu.upc.tparquiweb.dtos;

public class TipoTourDTO {
  private int idTipoTour;
  private String descripcionTipoTour;

  public TipoTourDTO() {
  }

  public TipoTourDTO(String descripcionTipoTour, int idTipoTour) {
    this.descripcionTipoTour = descripcionTipoTour;
    this.idTipoTour = idTipoTour;
  }

  public int getIdTipoTour() {
    return idTipoTour;
  }

  public void setIdTipoTour(int idTipoTour) {
    this.idTipoTour = idTipoTour;
  }

  public String getDescripcionTipoTour() {
    return descripcionTipoTour;
  }

  public void setDescripcionTipoTour(String descripcionTipoTour) {
    this.descripcionTipoTour = descripcionTipoTour;
  }
}

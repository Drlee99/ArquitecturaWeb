package pe.edu.upc.tparquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_tour")
public class TipoTour {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idTipoTour;

  @Column(name = "descripcionTipoTour",nullable = false)
  private String descripcionTipoTour;

  public TipoTour() {
  }

  public TipoTour(String descripcionTipoTour, int idTipoTour) {
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

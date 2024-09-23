package pe.edu.upc.tparquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "estado_reserva")
public class EstadoReserva {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idEstadoReserva;

  @Column(name = "descripcionEstadoReserva",nullable = false)
  private String descripcionEstadoReserva;

  public EstadoReserva() {
  }

  public EstadoReserva(int idEstadoReserva, String descripcionEstadoReserva) {
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

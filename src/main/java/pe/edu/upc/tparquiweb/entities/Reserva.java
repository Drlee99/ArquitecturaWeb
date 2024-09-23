package pe.edu.upc.tparquiweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reserva")
public class Reserva {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idReserva;

  @Column(name = "fechaReserva", nullable = false)
  private LocalDate fechaReserva;
  @Column(name = "fechaInicioReserva",nullable = false)
  private LocalDate fechaInicioReserva;
  @Column(name = "fechaFinReserva", nullable = false)
  private LocalDate fechaFinReserva;
  @Column(name = "totalPersonasReservas", nullable = false)
  private int totalPersonasReservas;

  @ManyToOne
  @JoinColumn(name = "agencia_id")
  private Agencia agencia;
  @ManyToOne
  @JoinColumn(name = "turista_id")
  private Turista turista;

  @ManyToOne
  @JoinColumn(name = "estadoReseva_id")
  private EstadoReserva estadoReserva;


  @ManyToOne
  @JoinColumn(name = "tipoTour_id")
  private TipoTour tipoTour;
  @ManyToOne
  @JoinColumn(name = "ubicacion_id")
  private Ubicacion ubicacion;

  public Reserva() {
  }

  public Reserva(int idReserva, LocalDate fechaReserva, LocalDate fechaInicioReserva, LocalDate fechaFinReserva, int totalPersonasReservas, Turista turista, Agencia agencia, TipoTour tipoTour, Ubicacion ubicacion) {
    this.idReserva = idReserva;
    this.fechaReserva = fechaReserva;
    this.fechaInicioReserva = fechaInicioReserva;
    this.fechaFinReserva = fechaFinReserva;
    this.totalPersonasReservas = totalPersonasReservas;
    this.turista = turista;
    this.agencia = agencia;
    this.tipoTour = tipoTour;
    this.ubicacion = ubicacion;
  }

  public int getIdReserva() {
    return idReserva;
  }

  public void setIdReserva(int idReserva) {
    this.idReserva = idReserva;
  }

  public LocalDate getFechaReserva() {
    return fechaReserva;
  }

  public void setFechaReserva(LocalDate fechaReserva) {
    this.fechaReserva = fechaReserva;
  }

  public LocalDate getFechaInicioReserva() {
    return fechaInicioReserva;
  }

  public void setFechaInicioReserva(LocalDate fechaInicioReserva) {
    this.fechaInicioReserva = fechaInicioReserva;
  }

  public LocalDate getFechaFinReserva() {
    return fechaFinReserva;
  }

  public void setFechaFinReserva(LocalDate fechaFinReserva) {
    this.fechaFinReserva = fechaFinReserva;
  }

  public int getTotalPersonasReservas() {
    return totalPersonasReservas;
  }

  public void setTotalPersonasReservas(int totalPersonasReservas) {
    this.totalPersonasReservas = totalPersonasReservas;
  }

  public Turista getTurista() {
    return turista;
  }

  public void setTurista(Turista turista) {
    this.turista = turista;
  }

  public Agencia getAgencia() {
    return agencia;
  }

  public void setAgencia(Agencia agencia) {
    this.agencia = agencia;
  }

  public TipoTour getTipoTour() {
    return tipoTour;
  }

  public void setTipoTour(TipoTour tipoTour) {
    this.tipoTour = tipoTour;
  }

  public Ubicacion getUbicacion() {
    return ubicacion;
  }

  public void setUbicacion(Ubicacion ubicacion) {
    this.ubicacion = ubicacion;
  }
}

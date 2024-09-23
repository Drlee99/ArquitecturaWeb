package pe.edu.upc.tparquiweb.dtos;

import java.time.LocalDate;

public class ReservaDTO {
  private int idReserva;
  private LocalDate fechaReserva;
  private LocalDate fechaInicioReserva;
  private LocalDate fechaFinReserva;
  private int totalPersonasReservas;
  private TuristaDTO turista;
  private AgenciaDTO agencia;
  private TipoTourDTO tipoTour;
  private UbicacionDTO ubicacion;

  public ReservaDTO() {
  }

  public ReservaDTO(int idReserva, LocalDate fechaReserva, LocalDate fechaInicioReserva, LocalDate fechaFinReserva, int totalPersonasReservas, TuristaDTO turista, AgenciaDTO agencia, TipoTourDTO tipoTour, UbicacionDTO ubicacion) {
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

  public TuristaDTO getTurista() {
    return turista;
  }

  public void setTurista(TuristaDTO turista) {
    this.turista = turista;
  }

  public AgenciaDTO getAgencia() {
    return agencia;
  }

  public void setAgencia(AgenciaDTO agencia) {
    this.agencia = agencia;
  }

  public TipoTourDTO getTipoTour() {
    return tipoTour;
  }

  public void setTipoTour(TipoTourDTO tipoTour) {
    this.tipoTour = tipoTour;
  }

  public UbicacionDTO getUbicacion() {
    return ubicacion;
  }

  public void setUbicacion(UbicacionDTO ubicacion) {
    this.ubicacion = ubicacion;
  }
}

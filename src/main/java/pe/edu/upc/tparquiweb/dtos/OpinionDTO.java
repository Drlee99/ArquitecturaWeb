package pe.edu.upc.tparquiweb.dtos;

import java.time.LocalDate;

public class OpinionDTO  {
  private int idOpinion;
  private int calificacionOpinion;
  private String comentariosOpinion;
  private LocalDate fechaOpinion;
  private TuristaDTO turista;
  private AgenciaDTO agencia;

  public OpinionDTO() {
  }

  public OpinionDTO(int idOpinion, int calificacionOpinion, String comentariosOpinion, LocalDate fechaOpinion, TuristaDTO turista, AgenciaDTO agencia) {
    this.idOpinion = idOpinion;
    this.calificacionOpinion = calificacionOpinion;
    this.comentariosOpinion = comentariosOpinion;
    this.fechaOpinion = fechaOpinion;
    this.turista = turista;
    this.agencia = agencia;
  }

  public int getIdOpinion() {
    return idOpinion;
  }

  public void setIdOpinion(int idOpinion) {
    this.idOpinion = idOpinion;
  }

  public int getCalificacionOpinion() {
    return calificacionOpinion;
  }

  public void setCalificacionOpinion(int calificacionOpinion) {
    this.calificacionOpinion = calificacionOpinion;
  }

  public String getComentariosOpinion() {
    return comentariosOpinion;
  }

  public void setComentariosOpinion(String comentariosOpinion) {
    this.comentariosOpinion = comentariosOpinion;
  }

  public LocalDate getFechaOpinion() {
    return fechaOpinion;
  }

  public void setFechaOpinion(LocalDate fechaOpinion) {
    this.fechaOpinion = fechaOpinion;
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
}

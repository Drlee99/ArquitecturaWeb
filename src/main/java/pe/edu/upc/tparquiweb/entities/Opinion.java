package pe.edu.upc.tparquiweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "opinion")
public class Opinion {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idOpinion;
  @Column(name = "calificacionOpinion", nullable = false)
  private int calificacionOpinion;
  @Column(name = "comentariosOpinion", nullable = false)
  private String comentariosOpinion;
  @Column(name = "fechaOpinion", nullable = false)
  private LocalDate fechaOpinion;

  @ManyToOne
  @JoinColumn(name = "turista_id")
  private Turista turista;

  @ManyToOne
  @JoinColumn(name = "agencia_id")
  private Agencia agencia;

  public Opinion() {
  }

  public Opinion(int idOpinion, int calificacionOpinion, String comentariosOpinion, LocalDate fechaOpinion, Turista turista, Agencia agencia) {
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
}

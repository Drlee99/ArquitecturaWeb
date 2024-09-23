package pe.edu.upc.tparquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ubicacion")
public class Ubicacion {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idUbicacion;

  @Column(name = "nombreUbicacion", nullable = false)
  private String nombreUbicacion;

  @Column(name = "descripcionUbicacion", nullable = false)
  private String descripcionUbicacion;

  @ManyToOne
  @JoinColumn(name = "departamento_id")
  private Departamento departamento;

  public Ubicacion() {
  }

  public Ubicacion(int idUbicacion, String nombreUbicacion, String descripcionUbicacion, Departamento departamento) {
    this.idUbicacion = idUbicacion;
    this.nombreUbicacion = nombreUbicacion;
    this.descripcionUbicacion = descripcionUbicacion;
    this.departamento = departamento;
  }

  public int getIdUbicacion() {
    return idUbicacion;
  }

  public void setIdUbicacion(int idUbicacion) {
    this.idUbicacion = idUbicacion;
  }

  public String getNombreUbicacion() {
    return nombreUbicacion;
  }

  public void setNombreUbicacion(String nombreUbicacion) {
    this.nombreUbicacion = nombreUbicacion;
  }

  public String getDescripcionUbicacion() {
    return descripcionUbicacion;
  }

  public void setDescripcionUbicacion(String descripcionUbicacion) {
    this.descripcionUbicacion = descripcionUbicacion;
  }

  public Departamento getDepartamento() {
    return departamento;
  }

  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }
}

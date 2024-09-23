package pe.edu.upc.tparquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "departamento")
public class Departamento {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idDepartamento;

  @Column(name = "nombreDepartamento", nullable = false)
  private String nombreDepartamento;

  public Departamento() {
  }

  public Departamento(int idDepartamento, String nombreDepartamento) {
    this.idDepartamento = idDepartamento;
    this.nombreDepartamento = nombreDepartamento;
  }

  public int getIdDepartamento() {
    return idDepartamento;
  }

  public void setIdDepartamento(int idDepartamento) {
    this.idDepartamento = idDepartamento;
  }

  public String getNombreDepartamento() {
    return nombreDepartamento;
  }

  public void setNombreDepartamento(String nombreDepartamento) {
    this.nombreDepartamento = nombreDepartamento;
  }
}

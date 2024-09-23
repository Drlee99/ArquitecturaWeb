package pe.edu.upc.tparquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "agencia")
public class Agencia {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idAgencia;

  @Column(name = "nombreAgencia", nullable = false)
  private String nombreAgencia;
  @Column(name = "telefonoAgencia",nullable = false)
  private String telefonoAgencia;

  @OneToOne
  @JoinColumn(name = "login_id")
  private Login login;

  public Agencia() {
  }

  public Agencia(int idAgencia, String nombreAgencia, String telefonoAgencia, Login login) {
    this.idAgencia = idAgencia;
    this.nombreAgencia = nombreAgencia;
    this.telefonoAgencia = telefonoAgencia;
    this.login = login;
  }

  public int getIdAgencia() {
    return idAgencia;
  }

  public void setIdAgencia(int idAgencia) {
    this.idAgencia = idAgencia;
  }

  public String getNombreAgencia() {
    return nombreAgencia;
  }

  public void setNombreAgencia(String nombreAgencia) {
    this.nombreAgencia = nombreAgencia;
  }

  public String getTelefonoAgencia() {
    return telefonoAgencia;
  }

  public void setTelefonoAgencia(String telefonoAgencia) {
    this.telefonoAgencia = telefonoAgencia;
  }

  public Login getLogin() {
    return login;
  }

  public void setLogin(Login login) {
    this.login = login;
  }
}

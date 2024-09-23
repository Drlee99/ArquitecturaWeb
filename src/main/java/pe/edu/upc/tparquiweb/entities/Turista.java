package pe.edu.upc.tparquiweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "turista")
public class Turista {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idTurista;

  @Column(name = "nombreTurista",nullable = false)
  private String nombreTurista;

  @Column(name = "apellidoTurista",nullable = false)
  private String apellidoTurista;

  @Column(name = "telefonoTurista",nullable = false)
  private String telefonoTurista;

  @Column(name = "nacionalidadTurista",nullable = false)
  private String nacionalidadTurista;

  @OneToOne
  @JoinColumn(name = "login_id")
  private Login login ;

  public Turista() {
  }

  public Turista(int idTurista, String nombreTurista, String apellidoTurista, String telefonoTurista, String nacionalidadTurista, Login login) {
    this.idTurista = idTurista;
    this.nombreTurista = nombreTurista;
    this.apellidoTurista = apellidoTurista;
    this.telefonoTurista = telefonoTurista;
    this.nacionalidadTurista = nacionalidadTurista;
    this.login = login;
  }

  public int getIdTurista() {
    return idTurista;
  }

  public void setIdTurista(int idTurista) {
    this.idTurista = idTurista;
  }

  public String getNombreTurista() {
    return nombreTurista;
  }

  public void setNombreTurista(String nombreTurista) {
    this.nombreTurista = nombreTurista;
  }

  public String getApellidoTurista() {
    return apellidoTurista;
  }

  public void setApellidoTurista(String apellidoTurista) {
    this.apellidoTurista = apellidoTurista;
  }

  public String getTelefonoTurista() {
    return telefonoTurista;
  }

  public void setTelefonoTurista(String telefonoTurista) {
    this.telefonoTurista = telefonoTurista;
  }

  public String getNacionalidadTurista() {
    return nacionalidadTurista;
  }

  public void setNacionalidadTurista(String nacionalidadTurista) {
    this.nacionalidadTurista = nacionalidadTurista;
  }

  public Login getLogin() {
    return this.login;
  }

  public void setLogin(Login login) {
    this.login = login;
  }
}

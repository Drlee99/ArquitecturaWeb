package pe.edu.upc.tparquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"login_id", "nombre_rol"})})
public class Rol {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idRol;

  @Column(name = "nombreRoL", nullable = false)
  private String nombreRol;

  @ManyToOne
  @JoinColumn(name = "login_id", nullable = false)
  private Login login;


  public Rol() {
  }

  public Rol(int idRol, String nombreRol, Login login) {
    this.idRol = idRol;
    this.nombreRol = nombreRol;
    this.login = login;
  }

  public int getIdRol() {
    return idRol;
  }

  public void setIdRol(int idRol) {
    this.idRol = idRol;
  }

  public String getNombreRol() {
    return nombreRol;
  }

  public void setNombreRol(String nombreRol) {
    this.nombreRol = nombreRol;
  }

  public Login getLogin() {
    return login;
  }

  public void setLogin(Login login) {
    this.login = login;
  }
}

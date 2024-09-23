package pe.edu.upc.tparquiweb.dtos;

import pe.edu.upc.tparquiweb.entities.Login;

public class RolDTO {
  private int idRol;
  private String nombreRol;

  private LoginDTO login;


  public RolDTO() {
  }


  public RolDTO(int idRol, String nombreRol, LoginDTO login) {
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

  public LoginDTO getLogin() {
    return login;
  }

  public void setLogin(LoginDTO login) {
    this.login = login;
  }
}

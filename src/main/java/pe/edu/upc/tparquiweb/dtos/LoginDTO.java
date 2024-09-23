package pe.edu.upc.tparquiweb.dtos;

import pe.edu.upc.tparquiweb.entities.Rol;

import java.util.List;

public class LoginDTO {
  private int idLogin;
  private String emailLogin;
  private String contrasenaLogin;
  private boolean activo;

  public LoginDTO() {
  }

  public LoginDTO(int idLogin, String emailLogin, String contrasenaLogin, Boolean activo) {
    this.idLogin = idLogin;
    this.emailLogin = emailLogin;
    this.contrasenaLogin = contrasenaLogin;
    this.activo = activo;
  }

  public int getIdLogin() {
    return idLogin;
  }

  public void setIdLogin(int idLogin) {
    this.idLogin = idLogin;
  }

  public String getEmailLogin() {
    return emailLogin;
  }

  public void setEmailLogin(String emailLogin) {
    this.emailLogin = emailLogin;
  }

  public String getContrasenaLogin() {
    return contrasenaLogin;
  }

  public void setContrasenaLogin(String contrasenaLogin) {
    this.contrasenaLogin = contrasenaLogin;
  }

  public Boolean getActivo() {
    return activo;
  }

  public void setActivo(Boolean activo) {
    this.activo = activo;
  }

}

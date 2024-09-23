package pe.edu.upc.tparquiweb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "login")
public class Login {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idLogin;

  @Column(name = "emailLogin",nullable = false,unique = true)
  private String emailLogin;
  @Column(name = "contrasenaLogin",nullable = false)
  private String contrasenaLogin;
  private Boolean activo;

  @JsonIgnore
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "login_id")
  private List<Rol> roles;

  public Login() {
  }

  public Login(int idLogin, String emailLogin, String contrasenaLogin, Boolean activo, List<Rol> roles) {
    this.idLogin = idLogin;
    this.emailLogin = emailLogin;
    this.contrasenaLogin = contrasenaLogin;
    this.activo = activo;
    this.roles = roles;
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

  public List<Rol> getRoles() {
    return roles;
  }

  public void setRoles(List<Rol> roles) {
    this.roles = roles;
  }
}

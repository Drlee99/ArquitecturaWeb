package pe.edu.upc.tparquiweb.dtos;

public class AgenciaDTO {
  private int idAgencia;
  private String nombreAgencia;
  private String telefonoAgencia;
  private LoginDTO login;

  public AgenciaDTO() {
  }

  public AgenciaDTO(LoginDTO login, String telefonoAgencia, String nombreAgencia, int idAgencia) {
    this.login = login;
    this.telefonoAgencia = telefonoAgencia;
    this.nombreAgencia = nombreAgencia;
    this.idAgencia = idAgencia;
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

  public LoginDTO getLogin() {
    return login;
  }

  public void setLogin(LoginDTO login) {
    this.login = login;
  }
}

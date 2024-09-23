package pe.edu.upc.tparquiweb.dtos;


public class TuristaDTO {
  private int idTurista;
  private String nombreTurista;
  private String apellidoTurista;
  private String telefonoTurista;
  private String nacionalidadTurista;
  private LoginDTO login;

  public TuristaDTO() {
  }

  public TuristaDTO(int idTurista, String nombreTurista, String apellidoTurista, String telefonoTurista, String nacionalidadTurista, LoginDTO login) {
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

  public LoginDTO getLogin() {
    return this.login;
  }

  public void setLogin(LoginDTO login) {
    this.login = login;
  }
}

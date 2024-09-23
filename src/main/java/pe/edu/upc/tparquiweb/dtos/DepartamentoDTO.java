package pe.edu.upc.tparquiweb.dtos;


public class DepartamentoDTO {
  private int idDepartamento;
  private String nombreDepartamento;

  public DepartamentoDTO() {
  }

  public DepartamentoDTO(int idDepartamento, String nombreDepartamento) {
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

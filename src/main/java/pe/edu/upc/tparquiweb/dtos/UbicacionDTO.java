package pe.edu.upc.tparquiweb.dtos;


public class UbicacionDTO {
  private int idUbicacion;
  private String nombreUbicacion;
  private String descripcionUbicacion;
  private DepartamentoDTO departamento;

  public UbicacionDTO() {
  }

  public UbicacionDTO(int idUbicacion, String nombreUbicacion, String descripcionUbicacion, DepartamentoDTO departamento) {
    this.idUbicacion = idUbicacion;
    this.nombreUbicacion = nombreUbicacion;
    this.descripcionUbicacion = descripcionUbicacion;
    this.departamento = departamento;
  }

  public int getIdUbicacion() {
    return idUbicacion;
  }

  public void setIdUbicacion(int idUbicacion) {
    this.idUbicacion = idUbicacion;
  }

  public String getNombreUbicacion() {
    return nombreUbicacion;
  }

  public void setNombreUbicacion(String nombreUbicacion) {
    this.nombreUbicacion = nombreUbicacion;
  }

  public String getDescripcionUbicacion() {
    return descripcionUbicacion;
  }

  public void setDescripcionUbicacion(String descripcionUbicacion) {
    this.descripcionUbicacion = descripcionUbicacion;
  }

  public DepartamentoDTO getDepartamento() {
    return departamento;
  }

  public void setDepartamento(DepartamentoDTO departamento) {
    this.departamento = departamento;
  }
}

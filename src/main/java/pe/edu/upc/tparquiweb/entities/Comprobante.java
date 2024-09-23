package pe.edu.upc.tparquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "comprobantes")
public class Comprobante {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idComprobante;


  @Column(name = "nombreComprobante", nullable = false)
  private String nombreComprobante;




  public Comprobante() {
  }

  public Comprobante(int idComprobante, String nombreComprobante) {
    this.idComprobante = idComprobante;
    this.nombreComprobante = nombreComprobante;
  }

  public int getIdComprobante() {
    return idComprobante;
  }

  public void setIdComprobante(int idComprobante) {
    this.idComprobante = idComprobante;
  }

  public String getNombreComprobante() {
    return nombreComprobante;
  }

  public void setNombreComprobante(String nombreComprobante) {
    this.nombreComprobante = nombreComprobante;
  }
}

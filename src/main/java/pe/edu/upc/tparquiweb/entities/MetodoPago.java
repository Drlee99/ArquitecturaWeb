package pe.edu.upc.tparquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "metodos_pago")
public class MetodoPago {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idMetodoPago;

  @Column(name = "nombreMetodoPago", nullable = false)
  private String nombreMetodoPago;




  public MetodoPago() {
  }

  public MetodoPago(int idMetodoPago, String nombreMetodoPago) {
    this.idMetodoPago = idMetodoPago;
    this.nombreMetodoPago = nombreMetodoPago;
  }

  public int getIdMetodoPago() {
    return idMetodoPago;
  }

  public void setIdMetodoPago(int idMetodoPago) {
    this.idMetodoPago = idMetodoPago;
  }

  public String getNombreMetodoPago() {
    return nombreMetodoPago;
  }

  public void setNombreMetodoPago(String nombreMetodoPago) {
    this.nombreMetodoPago = nombreMetodoPago;
  }
}

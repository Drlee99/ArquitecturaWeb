package pe.edu.upc.tparquiweb.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "pagos")
public class Pago {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idPago;


  @Column(name = "fechaPago", nullable = false)
  private LocalDate fechaPago;
  @Column(name = "totalPago", nullable = false)
  private double totalPago;

  @ManyToOne
  @JoinColumn(name = "metodoPago_id")
  private MetodoPago metodoPago;

  @ManyToOne
  @JoinColumn(name = "comprobante_id")
  private Comprobante comprobante;

  @OneToOne
  @JoinColumn(name = "reserva_id")
  private Reserva reserva;

  public Pago() {
  }

  public Pago(int idPago, LocalDate fechaPago, double valorPago, MetodoPago metodoPago, Comprobante comprobante) {
    this.idPago = idPago;
    this.fechaPago = fechaPago;
    this.totalPago = valorPago;
    this.metodoPago = metodoPago;
    this.comprobante = comprobante;
  }

  public int getIdPago() {
    return idPago;
  }

  public void setIdPago(int idPago) {
    this.idPago = idPago;
  }

  public LocalDate getFechaPago() {
    return fechaPago;
  }

  public void setFechaPago(LocalDate fechaPago) {
    this.fechaPago = fechaPago;
  }

  public double getTotalPago() {
    return totalPago;
  }

  public void setTotalPago(double valorPago) {
    this.totalPago = valorPago;
  }

  public MetodoPago getMetodoPago() {
    return metodoPago;
  }

  public void setMetodoPago(MetodoPago metodoPago) {
    this.metodoPago = metodoPago;
  }

  public Comprobante getComprobante() {
    return comprobante;
  }

  public void setComprobante(Comprobante comprobante) {
    this.comprobante = comprobante;
  }
}

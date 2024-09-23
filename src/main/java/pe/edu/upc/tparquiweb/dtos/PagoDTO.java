package pe.edu.upc.tparquiweb.dtos;

import pe.edu.upc.tparquiweb.entities.Comprobante;
import pe.edu.upc.tparquiweb.entities.MetodoPago;

import java.time.LocalDate;

public class PagoDTO {
  private int idPago;
  private LocalDate fechaPago;
  private double totalPago;
  private MetodoPagoDTO metodoPago;
  private ComprobanteDTO comprobante;

  public PagoDTO() {
  }

  public PagoDTO(int idPago, LocalDate fechaPago, double totalPago, MetodoPagoDTO metodoPago, ComprobanteDTO comprobante) {
    this.idPago = idPago;
    this.fechaPago = fechaPago;
    this.totalPago = totalPago;
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

  public void setTotalPago(double totalPago) {
    this.totalPago = totalPago;
  }

  public MetodoPagoDTO getMetodoPago() {
    return metodoPago;
  }

  public void setMetodoPago(MetodoPagoDTO metodoPago) {
    this.metodoPago = metodoPago;
  }

  public ComprobanteDTO getComprobante() {
    return comprobante;
  }

  public void setComprobante(ComprobanteDTO comprobante) {
    this.comprobante = comprobante;
  }
}

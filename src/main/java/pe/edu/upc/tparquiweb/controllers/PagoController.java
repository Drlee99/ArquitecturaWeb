package pe.edu.upc.tparquiweb.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.MetodoPagoDTO;
import pe.edu.upc.tparquiweb.dtos.PagoDTO;
import pe.edu.upc.tparquiweb.entities.MetodoPago;
import pe.edu.upc.tparquiweb.entities.Pago;
import pe.edu.upc.tparquiweb.servicesinterfaces.IMetodoPagoService;
import pe.edu.upc.tparquiweb.servicesinterfaces.IPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {
  @Autowired
  private IPagoService pagoService;

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping
  public List<PagoDTO> getPago(){
    ModelMapper modelMapper = new ModelMapper();
    return pagoService.FindAll().stream().
      map(x->modelMapper.map(x,PagoDTO.class)).collect(Collectors.toList());
  }

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping("/{id}")
  public PagoDTO getPagoById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    Pago pago = pagoService.FindById(id);
    PagoDTO dto = modelMapper.map(pago,PagoDTO.class);
    return dto;
  }

  @PreAuthorize("hasAuthority('TURISTA')")
  @PostMapping   //Create, aqui no es necesario parentesis
  public void addPago(@RequestBody PagoDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Pago pago = modelMapper.map(dto,Pago.class);
    pagoService.add(pago);
  }


  @PreAuthorize("hasAuthority('AGENCIA')")
  @PutMapping
  public void updatePago(@RequestBody PagoDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Pago pago = modelMapper.map(dto,Pago.class);
    pagoService.update(pago);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @DeleteMapping("/{id}")
  public void deleteMetodoPago(@PathVariable int id){
    pagoService.delete(id);
  }

}

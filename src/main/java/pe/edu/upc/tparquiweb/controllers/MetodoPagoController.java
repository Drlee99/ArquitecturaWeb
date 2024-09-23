package pe.edu.upc.tparquiweb.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.ComprobanteDTO;
import pe.edu.upc.tparquiweb.dtos.MetodoPagoDTO;
import pe.edu.upc.tparquiweb.entities.Comprobante;
import pe.edu.upc.tparquiweb.entities.MetodoPago;
import pe.edu.upc.tparquiweb.servicesinterfaces.IMetodoPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/metodospago")
public class MetodoPagoController {
  @Autowired
  private IMetodoPagoService metodoPagoService;

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping
  public List<MetodoPagoDTO> getMetodoPago(){
    ModelMapper modelMapper = new ModelMapper();
    return metodoPagoService.FindAll().stream().
      map(x->modelMapper.map(x,MetodoPagoDTO.class)).collect(Collectors.toList());
  }

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping("/{id}")
  public MetodoPagoDTO getMetodoPagoById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    MetodoPago metodoPago = metodoPagoService.FindById(id);
    MetodoPagoDTO dto = modelMapper.map(metodoPago,MetodoPagoDTO.class);
    return dto;
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @PostMapping   //Create, aqui no es necesario parentesis
  public void addMetodoPago(@RequestBody MetodoPagoDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    MetodoPago metodoPago = modelMapper.map(dto,MetodoPago.class);
    metodoPagoService.add(metodoPago);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @PutMapping
  public void updateMetdoPago(@RequestBody MetodoPagoDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    MetodoPago metodoPago = modelMapper.map(dto,MetodoPago.class);
    metodoPagoService.update(metodoPago);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @DeleteMapping("/{id}")
  public void deleteMetodoPago(@PathVariable int id){
    metodoPagoService.delete(id);
  }
}

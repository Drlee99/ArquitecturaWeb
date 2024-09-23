package pe.edu.upc.tparquiweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.ComprobanteDTO;
import pe.edu.upc.tparquiweb.entities.Comprobante;
import pe.edu.upc.tparquiweb.servicesinterfaces.IComprobanteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comprobantes")
public class ComprobanteController {
  @Autowired
  private IComprobanteService comprobanteService;

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping
  public List<ComprobanteDTO> getComprobantes(){
    ModelMapper modelMapper = new ModelMapper();
    return comprobanteService.FindAll().stream().
      map(x->modelMapper.map(x,ComprobanteDTO.class)).collect(Collectors.toList());
  }

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping("/{id}")
  public ComprobanteDTO getComprobanteById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    Comprobante comprobante = comprobanteService.FindById(id);
    ComprobanteDTO dto = modelMapper.map(comprobante,ComprobanteDTO.class);
    return dto;
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @PostMapping   //Create, aqui no es necesario parentesis
  public void addComprobante(@RequestBody ComprobanteDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Comprobante comprobante = modelMapper.map(dto,Comprobante.class);
    comprobanteService.add(comprobante);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @PutMapping
  public void updateComprobante(@RequestBody ComprobanteDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Comprobante comprobante = modelMapper.map(dto,Comprobante.class);
    comprobanteService.update(comprobante);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @DeleteMapping("/{id}")
  public void deleteComprobante(@PathVariable int id){
    comprobanteService.delete(id);
  }

}

package pe.edu.upc.tparquiweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.DepartamentoDTO;
import pe.edu.upc.tparquiweb.dtos.EstadoReservaDTO;
import pe.edu.upc.tparquiweb.entities.Departamento;
import pe.edu.upc.tparquiweb.entities.EstadoReserva;
import pe.edu.upc.tparquiweb.servicesinterfaces.IEstadoReservaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estadoreservas")
public class EstadoReservaController {
  @Autowired
  private IEstadoReservaService estadoReservaService;

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping
  public List<EstadoReservaDTO> getEstadoReserva(){
    ModelMapper modelMapper = new ModelMapper();
    return estadoReservaService.FindAll().stream().
      map(x->modelMapper.map(x,EstadoReservaDTO.class)).collect(Collectors.toList());
  }

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping("/{id}")
  public EstadoReservaDTO getEstadoReservaById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    EstadoReserva estadoReserva = estadoReservaService.FindById(id);
    EstadoReservaDTO dto = modelMapper.map(estadoReserva,EstadoReservaDTO.class);
    return dto;
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @PostMapping   //Create, aqui no es necesario parentesis
  public void addEstadoReserva(@RequestBody EstadoReservaDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    EstadoReserva estadoReserva = modelMapper.map(dto,EstadoReserva.class);
    estadoReservaService.add(estadoReserva);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @PutMapping
  public void updateEstadoReserva(@RequestBody EstadoReservaDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    EstadoReserva estadoReserva = modelMapper.map(dto,EstadoReserva.class);
    estadoReservaService.update(estadoReserva);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @DeleteMapping("/{id}")
  public void deleteEstadoReserva(@PathVariable int id){
    estadoReservaService.delete(id);
  }
}

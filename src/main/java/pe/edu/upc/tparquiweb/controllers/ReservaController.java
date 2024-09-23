package pe.edu.upc.tparquiweb.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.ReservaDTO;
import pe.edu.upc.tparquiweb.entities.Reserva;
import pe.edu.upc.tparquiweb.servicesinterfaces.IReservaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
   @Autowired
   private IReservaService reservaService;

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping
  public List<ReservaDTO> getReserva(){
    ModelMapper modelMapper = new ModelMapper();
    return reservaService.FindAll().stream().
      map(x->modelMapper.map(x,ReservaDTO.class)).collect(Collectors.toList());
  }

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping("/{id}")
  public ReservaDTO getReservaById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    Reserva reserva = reservaService.FindById(id);
    ReservaDTO dto = modelMapper.map(reserva,ReservaDTO.class);
    return dto;
  }

  @PreAuthorize("hasAuthority('TURISTA')")
  @PostMapping   //Create, aqui no es necesario parentesis
  public void addReserva(@RequestBody ReservaDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Reserva reserva = modelMapper.map(dto,Reserva.class);
    reservaService.add(reserva);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @PutMapping
  public void updateReserva(@RequestBody ReservaDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Reserva reserva = modelMapper.map(dto,Reserva.class);
    reservaService.update(reserva);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @DeleteMapping("/{id}")
  public void deleteReserva(@PathVariable int id){
    reservaService.delete(id);
  }

}

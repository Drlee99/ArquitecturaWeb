package pe.edu.upc.tparquiweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.TipoTourDTO;
import pe.edu.upc.tparquiweb.dtos.UbicacionDTO;
import pe.edu.upc.tparquiweb.entities.TipoTour;
import pe.edu.upc.tparquiweb.entities.Ubicacion;
import pe.edu.upc.tparquiweb.servicesinterfaces.ITipoTourService;
import pe.edu.upc.tparquiweb.servicesinterfaces.IUbicacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipotours")
public class TipoTourController {
  @Autowired
  private ITipoTourService tipoTourService;

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping
  public List<TipoTourDTO> getTipoTour(){
    ModelMapper modelMapper = new ModelMapper();
    return tipoTourService.FindAll().stream().
      map(x->modelMapper.map(x, TipoTourDTO.class)).collect(Collectors.toList());
  }

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping("/{id}")
  public TipoTourDTO getTipoTourById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    TipoTour tipoTour = tipoTourService.FindById(id);
    TipoTourDTO dto = modelMapper.map(tipoTour,TipoTourDTO.class);
    return dto;
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @PostMapping   //Create, aqui no es necesario parentesis
  public void addTipoTour(@RequestBody TipoTourDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    TipoTour tipoTour = modelMapper.map(dto,TipoTour.class);
    tipoTourService.add(tipoTour);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @PutMapping
  public void updateTipoTour(@RequestBody TipoTourDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    TipoTour tipoTour = modelMapper.map(dto,TipoTour.class);
    tipoTourService.update(tipoTour);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @DeleteMapping("/{id}")
  public void deleteTipoTour(@PathVariable int id){
    tipoTourService.delete(id);
  }
}

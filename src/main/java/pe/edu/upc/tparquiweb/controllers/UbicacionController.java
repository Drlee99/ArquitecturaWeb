package pe.edu.upc.tparquiweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.PagoDTO;
import pe.edu.upc.tparquiweb.dtos.UbicacionDTO;
import pe.edu.upc.tparquiweb.entities.Pago;
import pe.edu.upc.tparquiweb.entities.Ubicacion;
import pe.edu.upc.tparquiweb.servicesinterfaces.IPagoService;
import pe.edu.upc.tparquiweb.servicesinterfaces.IUbicacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ubicaciones")
public class UbicacionController {
  @Autowired
  private IUbicacionService ubicacionService;

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping
  public List<UbicacionDTO> getUbicacion(){
    ModelMapper modelMapper = new ModelMapper();
    return ubicacionService.FindAll().stream().
      map(x->modelMapper.map(x, UbicacionDTO.class)).collect(Collectors.toList());
  }


  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping("/{id}")
  public UbicacionDTO getUbicacionById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    Ubicacion ubicacion = ubicacionService.FindById(id);
    UbicacionDTO dto = modelMapper.map(ubicacion,UbicacionDTO.class);
    return dto;
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @PostMapping   //Create, aqui no es necesario parentesis
  public void addUbicacion(@RequestBody UbicacionDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Ubicacion ubicacion = modelMapper.map(dto,Ubicacion.class);
    ubicacionService.add(ubicacion);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @PutMapping
  public void updateUbicacion(@RequestBody UbicacionDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Ubicacion ubicacion = modelMapper.map(dto,Ubicacion.class);
    ubicacionService.update(ubicacion);
  }

  @PreAuthorize("hasAuthority('AGENCIA')")
  @DeleteMapping("/{id}")
  public void deleteUbicacion(@PathVariable int id){
    ubicacionService.delete(id);
  }
}

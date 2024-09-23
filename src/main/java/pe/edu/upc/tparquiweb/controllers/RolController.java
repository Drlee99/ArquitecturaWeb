package pe.edu.upc.tparquiweb.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.RolDTO;
import pe.edu.upc.tparquiweb.entities.Rol;
import pe.edu.upc.tparquiweb.servicesinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {
@Autowired
  private IRolService rolService;

  @GetMapping
  public List<RolDTO> getRol(){
    ModelMapper modelMapper = new ModelMapper();
    return rolService.FindAll().stream().
      map(x->modelMapper.map(x,RolDTO.class)).collect(Collectors.toList());
  }

  @GetMapping("/{id}")
  public RolDTO getRolById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    Rol rol = rolService.FindById(id);
    RolDTO dto = modelMapper.map(rol,RolDTO.class);
    return dto;
  }

  @PostMapping   //Create, aqui no es necesario parentesis
  public void addRol(@RequestBody RolDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Rol rol = modelMapper.map(dto,Rol.class);
    rolService.add(rol);
  }


  @PutMapping
  public void updateRol(@RequestBody RolDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Rol rol = modelMapper.map(dto,Rol.class);
    rolService.update(rol);
  }

  @DeleteMapping("/{id}")
  public void deleteRol(@PathVariable int id){
    rolService.delete(id);
  }

}

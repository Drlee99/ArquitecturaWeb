package pe.edu.upc.tparquiweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.AgenciaDTO;
import pe.edu.upc.tparquiweb.entities.Agencia;
import pe.edu.upc.tparquiweb.servicesinterfaces.IAgenciaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/agencias")
public class AgenciaController {
  @Autowired
  private IAgenciaService agenciaService;

  @GetMapping
  public List<AgenciaDTO> getAgencia(){
    ModelMapper modelMapper = new ModelMapper();
    return agenciaService.FindAll().stream().
      map(x->modelMapper.map(x,AgenciaDTO.class)).collect(Collectors.toList());
  }

  @GetMapping("/{id}")
  public AgenciaDTO getAgenciaById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    Agencia agencia = agenciaService.FindById(id);
    AgenciaDTO dto = modelMapper.map(agencia,AgenciaDTO.class);
    return dto;
  }

  @PostMapping   //Create, aqui no es necesario parentesis
  public void addAgencia(@RequestBody AgenciaDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Agencia agencia = modelMapper.map(dto,Agencia.class);
    agenciaService.add(agencia);
  }

  @PutMapping
  public void updateAgencia(@RequestBody AgenciaDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Agencia agencia = modelMapper.map(dto,Agencia.class);
    agenciaService.update(agencia);
  }

  @DeleteMapping("/{id}")
  public void deleteAgencia(@PathVariable int id){
    agenciaService.delete(id);
  }
}

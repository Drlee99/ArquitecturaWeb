package pe.edu.upc.tparquiweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.ComprobanteDTO;
import pe.edu.upc.tparquiweb.dtos.DepartamentoDTO;
import pe.edu.upc.tparquiweb.entities.Comprobante;
import pe.edu.upc.tparquiweb.entities.Departamento;
import pe.edu.upc.tparquiweb.servicesinterfaces.IDepartamentoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/departamentos")
//@PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")

public class DepartamentoController {
  @Autowired
  private IDepartamentoService departamentoService;

  @GetMapping
  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  public List<DepartamentoDTO> getDepartamentos(){
    ModelMapper modelMapper = new ModelMapper();
    return departamentoService.FindAll().stream().
      map(x->modelMapper.map(x,DepartamentoDTO.class)).collect(Collectors.toList());
  }

  @GetMapping("/{id}")
  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  public DepartamentoDTO getDepartamentoById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    Departamento departamento = departamentoService.FindById(id);
    DepartamentoDTO dto = modelMapper.map(departamento,DepartamentoDTO.class);
    return dto;
  }

  @PostMapping   //Create, aqui no es necesario parentesis
  @PreAuthorize("hasAuthority('AGENCIA')")
  public void addDepartamento(@RequestBody DepartamentoDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Departamento departamento = modelMapper.map(dto,Departamento.class);
    departamentoService.add(departamento);
  }

  @PutMapping
  @PreAuthorize("hasAuthority('AGENCIA')")
  public void updateDepartamento(@RequestBody DepartamentoDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Departamento departamento = modelMapper.map(dto,Departamento.class);
    departamentoService.update(departamento);
  }

  @DeleteMapping("/{id}")
  @PreAuthorize("hasAuthority('AGENCIA')")
  public void deleteDepartamento(@PathVariable int id){
    departamentoService.delete(id);
  }

}

package pe.edu.upc.tparquiweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.TuristaDTO;
import pe.edu.upc.tparquiweb.entities.Turista;
import pe.edu.upc.tparquiweb.servicesinterfaces.ITuristaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/turistas")
public class TuristaController {
  @Autowired
  private ITuristaService turistaService;

  @GetMapping
  public List<TuristaDTO> getTurista(){
    ModelMapper modelMapper = new ModelMapper();
    return turistaService.FindAll().stream().
      map(x->modelMapper.map(x, TuristaDTO.class)).collect(Collectors.toList());
  }

  @GetMapping("/{id}")
  public TuristaDTO getTuristaById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    Turista turista = turistaService.FindById(id);
    TuristaDTO dto = modelMapper.map(turista,TuristaDTO.class);
    return dto;
  }

  @PostMapping   //Create, aqui no es necesario parentesis
  public void addTurista(@RequestBody TuristaDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Turista turista = modelMapper.map(dto,Turista.class);
    turistaService.add(turista);
  }


  @PutMapping
  public void updateTurista(@RequestBody TuristaDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Turista turista = modelMapper.map(dto,Turista.class);
    turistaService.update(turista);
  }

  @DeleteMapping("/{id}")
  public void deleteTurista(@PathVariable int id){
    turistaService.delete(id);
  }

}

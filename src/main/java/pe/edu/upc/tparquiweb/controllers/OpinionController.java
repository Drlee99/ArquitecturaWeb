package pe.edu.upc.tparquiweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.OpinionDTO;
import pe.edu.upc.tparquiweb.entities.Opinion;
import pe.edu.upc.tparquiweb.servicesinterfaces.IOpinionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/opiniones")
public class OpinionController {
  @Autowired
  private IOpinionService opinionService;


  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping
  public List<OpinionDTO> getOpinion(){
    ModelMapper modelMapper = new ModelMapper();
    return opinionService.FindAll().stream().
      map(x->modelMapper.map(x,OpinionDTO.class)).collect(Collectors.toList());
  }

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @GetMapping("/{id}")
  public OpinionDTO getOpinionById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    Opinion opinion = opinionService.FindById(id);
    OpinionDTO dto = modelMapper.map(opinion,OpinionDTO.class);
    return dto;
  }

  @PreAuthorize("hasAuthority('TURISTA')")
  @PostMapping   //Create, aqui no es necesario parentesis
  public void addOpinion(@RequestBody OpinionDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Opinion opinion = modelMapper.map(dto,Opinion.class);
    opinionService.add(opinion);
  }

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @PutMapping
  public void updateOpinion(@RequestBody OpinionDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Opinion opinion = modelMapper.map(dto,Opinion.class);
    opinionService.update(opinion);
  }

  @PreAuthorize("hasAuthority('TURISTA') or hasAuthority('AGENCIA')")
  @DeleteMapping("/{id}")
  public void deleteOpinion(@PathVariable int id){
    opinionService.delete(id);
  }
}

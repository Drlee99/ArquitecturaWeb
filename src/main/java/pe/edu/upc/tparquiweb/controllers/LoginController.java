package pe.edu.upc.tparquiweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tparquiweb.dtos.LoginDTO;
import pe.edu.upc.tparquiweb.entities.Login;
import pe.edu.upc.tparquiweb.servicesinterfaces.ILoginService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/logines")
public class LoginController {
  @Autowired
  private ILoginService loginService;

  @Autowired
  private PasswordEncoder passwordEncoder;


  @GetMapping
  public List<LoginDTO> getLogin(){
    ModelMapper modelMapper = new ModelMapper();
    return loginService.FindAll().stream().
      map(x->modelMapper.map(x,LoginDTO.class)).collect(Collectors.toList());
  }

  @GetMapping("/{id}")
  public LoginDTO getLoginById(@PathVariable int id){
    ModelMapper modelMapper = new ModelMapper();
    Login login = loginService.FindById(id);
    LoginDTO dto = modelMapper.map(login,LoginDTO.class);
    return dto;
  }

  @PostMapping   //Create, aqui no es necesario parentesis
  public void addLogin(@RequestBody LoginDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Login login = modelMapper.map(dto,Login.class);
    String encodedPassword = passwordEncoder.encode(login.getContrasenaLogin());
    login.setContrasenaLogin(encodedPassword);
    loginService.add(login);
  }



  @PutMapping
  public void updateLogin(@RequestBody LoginDTO dto){
    ModelMapper modelMapper = new ModelMapper();
    Login login = modelMapper.map(dto,Login.class);
    loginService.update(login);
  }

  @DeleteMapping("/{id}")
  public void deleteLogin(@PathVariable int id){
    loginService.delete(id);
  }
}

package pe.edu.upc.tparquiweb.servicesimplements;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.Login;
import pe.edu.upc.tparquiweb.repostiories.ILoginRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.ILoginService;

import java.util.List;

@Service
public class LoginServiceImplement implements ILoginService {
  private static final Logger log = LoggerFactory.getLogger(LoginServiceImplement.class);
  @Autowired
private ILoginRepository loginRepository;

  @Override
  public void add(Login l) {
    loginRepository.save(l);
  }

  @Override
  public void update(Login l) {
    loginRepository.save(l);
  }

  @Override
  public void delete(Integer id) {
    loginRepository.deleteById(id);
  }

  @Override
  public List<Login> FindAll() {
    return loginRepository.findAll();
  }

  @Override
  public Login FindById(Integer id) {
    return loginRepository.findById(id).orElse(null);
  }
}

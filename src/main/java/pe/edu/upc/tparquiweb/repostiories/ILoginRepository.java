package pe.edu.upc.tparquiweb.repostiories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.tparquiweb.entities.Login;

@Repository
public interface ILoginRepository extends JpaRepository<Login,Integer> {
  public Login findOneByEmailLogin(String email);

  //BUSCAR POR NOMBRE
  @Query("select count(l.emailLogin) from Login l where l.emailLogin =:emailLogin")
  public int buscarEmail(@Param("emailLogin") String emailLogin);


  //INSERTAR ROLES
  @Transactional
  @Modifying
  @Query(value = "insert into roles (nombre_rol, login_id) VALUES (:rol, :login_id)", nativeQuery = true)
  public void insRol(@Param("rol") String authority, @Param("login_id") Integer login_id);

}

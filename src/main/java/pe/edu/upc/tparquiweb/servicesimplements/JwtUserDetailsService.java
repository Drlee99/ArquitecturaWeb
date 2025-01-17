package pe.edu.upc.tparquiweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pe.edu.upc.tparquiweb.entities.Login;
import pe.edu.upc.tparquiweb.repostiories.ILoginRepository;
import pe.edu.upc.tparquiweb.servicesinterfaces.ILoginService;


import java.util.ArrayList;
import java.util.List;


@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private ILoginRepository loginRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Login user = loginRepository.findOneByEmailLogin(username);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("User not exists", username));
        }

        List<GrantedAuthority> roles = new ArrayList<>();

        user.getRoles().forEach(rol -> {
            roles.add(new SimpleGrantedAuthority(rol.getNombreRol()));
        });

        UserDetails ud = new org.springframework.security.core.userdetails.User(user.getEmailLogin(), user.getContrasenaLogin(), user.getActivo(), true, true, true, roles);

        return ud;
    }
}

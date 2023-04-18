/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import com.thanosPharma.dao.UsuarioDAO;
import com.thanosPharma.logic.entities.Rol;
import com.thanosPharma.logic.entities.Usuario;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import static org.hibernate.query.sqm.tree.SqmNode.log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author benal
 */
@Service("userDetailsService")
public class UsuariService implements UserDetailsService {

    @Autowired
    private UsuarioDAO usuariDAO;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario usuari = usuariDAO.findByUsername(username);

        if (usuari == null) {

            throw new UsernameNotFoundException(username);

        }
        
        var rols = new ArrayList<GrantedAuthority>();
        
        for (Rol rol : usuari.getRols()) {
            rols.add(new SimpleGrantedAuthority(rol.getNom()));
            System.out.println(rol);
        }
        

        log.info(usuari.getUsername());
        log.info(usuari.getPassword());
        log.info(rols.get(0).getAuthority());

        return new User(usuari.getUsername(), usuari.getPassword(), rols);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.dao;

import com.thanosPharma.logic.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Kiwi
 */
public interface UsuarioDAO extends CrudRepository<Usuario, Long> {
    
    Usuario findByUsername(String username);
    
}

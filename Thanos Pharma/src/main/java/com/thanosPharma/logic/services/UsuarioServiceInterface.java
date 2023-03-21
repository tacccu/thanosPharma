/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.services;

import com.thanosPharma.logic.entities.Usuario;
import java.util.List;

/**
 *
 * @author Kiwi
 */
public interface UsuarioServiceInterface {

    public List<Usuario> listUsuarios();

    public void guardar(Usuario usuario);

    public void borrar(Usuario usuario);

}

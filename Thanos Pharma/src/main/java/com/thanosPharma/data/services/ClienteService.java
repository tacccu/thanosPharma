/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.data.services;

import com.thanosPharma.logic.entities.Cliente;
import java.util.List;

/**
 *
 * @author Kiwi
 */
public interface ClienteService {

    public List<Cliente> listPersonas();

    public void guardar(Cliente cliente);

    public void borrar(Cliente cliente);

}

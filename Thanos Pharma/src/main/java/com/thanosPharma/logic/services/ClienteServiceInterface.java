/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.services;

import com.thanosPharma.logic.entities.Cliente;
import java.util.List;

/**
 *
 * @author Kiwi
 */
public interface ClienteServiceInterface {

    public List<Cliente> listClientes();

    public void saveClientes(Cliente cliente);

    public void deleteClientes(Cliente cliente);

    public Cliente searchClientes(Cliente cliente);
}

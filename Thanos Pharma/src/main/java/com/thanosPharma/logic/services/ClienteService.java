/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.services;

import com.thanosPharma.dao.ClienteDAO;
import com.thanosPharma.logic.entities.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kiwi
 */
@Service
public class ClienteService implements ClienteServiceInterface {

    @Autowired
    private ClienteDAO clienteDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> listClientes() {
        return (List<Cliente>) clienteDAO.findAll();
    }

    @Override
    @Transactional
    public void saveClientes(Cliente cliente) {
        clienteDAO.save(cliente);
    }

    @Override
    @Transactional 
    public void deleteClientes(Cliente cliente) {
        clienteDAO.delete(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente searchClientes(Cliente cliente) {
        return clienteDAO.findById(cliente.getId_cliente()).orElse(null);
    }
}

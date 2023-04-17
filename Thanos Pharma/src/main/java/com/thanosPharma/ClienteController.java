/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import com.thanosPharma.logic.entities.Cliente;
import com.thanosPharma.logic.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Kiwi
 */
@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public String homeClientes(Model model) {

        model.addAttribute("clientes", clienteService.listClientes());

        return "mainClientes";
    }

    @GetMapping("/formClientes")
    public String formClientes(Cliente cliente) {
        return "formClientes";
    }

    @PostMapping("/saveClientes")
    public String saveClientes(@Valid Cliente cliente, BindingResult br) {

        if (br.hasErrors()) {
            return "formClientes";
        } else {
            clienteService.saveClientes(cliente);
            return "redirect:/clientes";
        }

    }

    @GetMapping("/modifyCliente/{id_cliente}")
    public String modifyCliente(Cliente cliente, Model model) {

        model.addAttribute("cliente", clienteService.searchClientes(cliente));

        return "formClientes";
    }

    @GetMapping("/deleteCliente/{id_cliente}")
    public String deleteCliente(Cliente cliente) {

        clienteService.deleteClientes(cliente);

        return "redirect:/clientes";
    }
}

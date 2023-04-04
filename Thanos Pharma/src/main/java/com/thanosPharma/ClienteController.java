/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import com.thanosPharma.logic.entities.Cliente;
import com.thanosPharma.logic.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @GetMapping("/mainClientes")
    public String showMainClientes(Model model) {
        
//        model.addAttribute("mainClientes", clienteService.listClientes());
        
        return "mainClientes";
    }

    @GetMapping("/formClientes")
    public String formClientes(Cliente cliente) {
        return "formClientes";
    }

    @PostMapping("/saveClientes")
    public String saveClientes(Cliente cliente) {

        clienteService.saveClientes(cliente);

        return "redirect:/mainClientes";
    }

}

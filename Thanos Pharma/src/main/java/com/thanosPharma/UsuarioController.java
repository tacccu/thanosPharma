/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import com.thanosPharma.logic.services.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Kiwi
 */
@Controller
public class UsuarioController {

    private UsuarioService usuarioService;

    @GetMapping("/modifUsuario")
    public String showModifUsuario(Model model) {
        return "modifUsuario";
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Kiwi
 */
@Controller
public class MainController {

    private final String msg = "Hola";

    @GetMapping("/")
    public String startTest(Model model) {

        model.addAttribute("message", "soy un test");

        return "indice";
    }

    @GetMapping("/indice")
    public String start(Model model) {

        model.addAttribute("message", "soy un test");

        return "indice";
    }

    @GetMapping("/blue")
    public String showBlue(Model model) {
        model.addAttribute("message", "Soy azul");
        return "blue";
    }

    @GetMapping("/modifUsuario")
    public String showModifUsuario(Model model) {
        return "modifUsuario";
    }

}

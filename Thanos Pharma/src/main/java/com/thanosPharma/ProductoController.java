/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.thanosPharma.logic.services.ProductoServiceInterface;

/**
 *
 * @author Kiwi
 */
@Controller
public class ProductoController {

    @Autowired
    private ProductoServiceInterface productoService;

    @GetMapping("/productos") //Pàgina inicial dels gossos
    public String homeProductos(Model model) {

        //llistarGossos() retorna el llistat d'objectes gos guardats en la taula gossos de la BBDD    
        model.addAttribute("productos", productoService.listProductos());

        return "homeProductos"; //Retorna la pàgina iniciEnviarDades
    }

}

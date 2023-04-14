/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import com.thanosPharma.logic.services.OrdenVentaService;
import com.thanosPharma.logic.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Kiwi
 */
@Controller
public class OrdenVentaController {

    @Autowired
    OrdenVentaService ordenVentaService;

    @GetMapping("/ventas")
    public String homeVentas(Model model) {


        return "mainVentas";
    }
    
    @GetMapping("/formVentas")
    public String formVentas(Model model) {


        return "formVentas";
    }
    
    @GetMapping("/ventasDetalles")
    public String homeProductos(Model model) {


        return "ventasDetalles";
    }

}

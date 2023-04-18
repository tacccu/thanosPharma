/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;


import com.thanosPharma.logic.entities.OrdenVenta;
import com.thanosPharma.logic.services.OrdenVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        boolean isAdmin = auth.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("admin"));
        model.addAttribute("isAdmin", isAdmin);

        return "mainVentas";
    }

    @GetMapping("/formVentas")
    public String formVentas(OrdenVenta ordenVenta) {

        return "formVentas";
    }

    @GetMapping("/ventasDetalles")
    public String homeProductos(OrdenVenta ordenVenta) {

        return "ventasDetalles";
    }

}

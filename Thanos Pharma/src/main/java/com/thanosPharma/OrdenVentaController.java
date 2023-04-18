/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import com.thanosPharma.logic.entities.Producto;
import com.thanosPharma.logic.services.OrdenVentaService;
import com.thanosPharma.logic.services.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
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
public class OrdenVentaController {

    @Autowired
    OrdenVentaService ordenVentaService;

    @GetMapping("/ventass")
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;


import com.thanosPharma.logic.entities.OrdenVenta;
import com.thanosPharma.logic.entities.Producto;
import com.thanosPharma.logic.services.OrdenVentaService;
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
    public String formVentas(OrdenVenta ordenVenta) {

        return "formVentas";
    }

    @GetMapping("/ventasDetalles")
    public String homeVentas(OrdenVenta ordenVenta) {

        return "ventasDetalles";
    }

     @PostMapping("/saveVentas")
    public String saveVentas(@Valid OrdenVenta ordenVenta, BindingResult br) {
        if (br.hasErrors()) {
            return "formVentas";
        }
        ordenVentaService.guardar(ordenVenta);

        return "redirect:/mainVentas";
    }
    
    @GetMapping("/modifyVentas/{id_venta}")
    public String modifyVentas(OrdenVenta ordenVenta, Model model) {

        model.addAttribute("venta", ordenVentaService.searchSale(ordenVenta));
        model.addAttribute("isAModification", true);

        return "formVentas";
    }

    @GetMapping("/deleteVentas/{id_venta}")
    public String deleteVentas(OrdenVenta ordenVenta) {

        ordenVentaService.borrar(ordenVenta);

        return "redirect:/ventas";
    }
}

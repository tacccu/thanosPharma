/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import com.thanosPharma.logic.entities.DetalleVenta;
import com.thanosPharma.logic.entities.OrdenVenta;
import com.thanosPharma.logic.services.DetalleVentaService;
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
public class DetalleVentaController {

    @Autowired
    private DetalleVentaService detalleVentaService;

    @GetMapping("/formDetalleVentas")
    public String formDetalleVentas(DetalleVenta detalleVenta) {

        return "formDetalleVentas";
    }
    
      @PostMapping("/saveVentasDetalles")
    public String saveVentasDetalles(@Valid DetalleVenta detalleVenta, BindingResult br) {
        if (br.hasErrors()) {
            return "formDetalleVentas";
        }
        detalleVentaService.guardar(detalleVenta);

        return "redirect:/ventasDetalles";
    }
    
    @GetMapping("/deleteVentasDetalles/{ordenVenta}")
    public String deleteVentasDetalles(DetalleVenta detalleVenta) {

        detalleVentaService.borrar(detalleVenta);

        return "redirect:/ventasDetalles";
    }
    
    @GetMapping("/modifyVentasDetalles/{ordenVenta}")
    public String modifyVentasDetalles(DetalleVenta detalleVenta, Model model) {

        model.addAttribute("venta", detalleVentaService.searchSaleDetails(detalleVenta));
        model.addAttribute("isAModification", true);

        return "formDetalleVentas";
    }

}

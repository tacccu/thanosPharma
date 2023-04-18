/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import com.thanosPharma.logic.entities.DetalleVenta;
import com.thanosPharma.logic.entities.OrdenVenta;
import com.thanosPharma.logic.services.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

}

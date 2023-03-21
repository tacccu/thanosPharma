/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.thanosPharma.logic.services.DetalleVentaServiceInterface;

/**
 *
 * @author Kiwi
 */
@Controller
public class DetalleVentaController {

    @Autowired
    private DetalleVentaServiceInterface detalleVentaService;

}

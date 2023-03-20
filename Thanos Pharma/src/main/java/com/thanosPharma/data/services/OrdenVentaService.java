/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.data.services;

import com.thanosPharma.logic.entities.OrdenVenta;
import java.util.List;

/**
 *
 * @author Kiwi
 */
public interface OrdenVentaService {
    
    public List<OrdenVenta> listOrdenesVenta();

    public void guardar(OrdenVenta cliente);

    public void borrar(OrdenVenta cliente);
    
}

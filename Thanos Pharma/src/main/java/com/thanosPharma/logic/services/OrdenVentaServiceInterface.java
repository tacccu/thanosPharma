/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.services;

import com.thanosPharma.logic.entities.OrdenVenta;
import java.util.List;

/**
 *
 * @author Kiwi
 */
public interface OrdenVentaServiceInterface {
    
    public List<OrdenVenta> listOrdenesVenta();

    public void guardar(OrdenVenta ordenVenta);

    public void borrar(OrdenVenta ordenVenta);
  
}

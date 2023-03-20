/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.data.services;

import com.thanosPharma.logic.entities.DetalleVenta;
import java.util.List;

/**
 *
 * @author Kiwi
 */
public interface DetalleVentaService {

    public List<DetalleVenta> listDetallesVenta();

    public void guardar(DetalleVenta detalleVenta);

    public void borrar(DetalleVenta detalleVenta);
}

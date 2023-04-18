/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.services;

import com.thanosPharma.dao.OrdenVentaDAO;
import com.thanosPharma.logic.entities.OrdenVenta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kiwi
 */
@Service
public class OrdenVentaService implements OrdenVentaServiceInterface {
    @Autowired
    private OrdenVentaDAO ordenVentaDAO;

    @Override
    public void guardar(OrdenVenta ordenVenta) {
        ordenVentaDAO.save(ordenVenta);
    }

    @Override
    public void borrar(OrdenVenta ordenVenta) {
        ordenVentaDAO.delete(ordenVenta);
    }

    @Override
    public List<OrdenVenta> listOrdenesVenta() {
        return (List<OrdenVenta>) ordenVentaDAO.findAll();    
    }
    
    @Transactional(readOnly = true)
    public OrdenVenta searchSale(OrdenVenta ordenVenta) {
        return ordenVentaDAO.findById(ordenVenta.getId_venta()).orElse(null);
    }
           
}

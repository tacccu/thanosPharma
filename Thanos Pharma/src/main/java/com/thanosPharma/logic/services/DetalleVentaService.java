/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.services;

import com.thanosPharma.dao.*;
import com.thanosPharma.logic.entities.DetalleVenta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kiwi
 */
@Service
public class DetalleVentaService implements DetalleVentaServiceInterface {

    @Autowired
    private DetalleVentaDAO detalleVentaDAO;

    @Override
    public void guardar(DetalleVenta detalleVenta) {
        detalleVentaDAO.save(detalleVenta);
    }

    @Override
    public void borrar(DetalleVenta detalleVenta) {
        detalleVentaDAO.delete(detalleVenta);
    }

    @Override
    public List<DetalleVenta> listDetallesVenta() {
        return (List<DetalleVenta>) detalleVentaDAO.findAll();
    }

    @Transactional(readOnly = true)
    public DetalleVenta searchSaleDetails(DetalleVenta detalleVenta) {
        return detalleVentaDAO.findById(detalleVenta.getOrdenVenta()).orElse(null);
    }
}

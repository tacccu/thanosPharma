/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.services;

import com.thanosPharma.dao.ProductoDAO;
import com.thanosPharma.logic.entities.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kiwi
 */
@Service
public class ProductoService implements ProductoServiceInterface {

    @Autowired
    private ProductoDAO productoDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> listProductos() {
        return (List<Producto>) productoDAO.findAll();
    }

    @Override
    @Transactional
    public void saveProduct(Producto producto) {
        productoDAO.save(producto);
    }

    @Override
    @Transactional
    public void deleteProduct(Producto producto) {
        productoDAO.delete(producto);
    }

    @Override
    @Transactional(readOnly = true)
    public Producto searchProduct(Producto producto) {
        return productoDAO.findById(producto.getCodigoNacional()).orElse(null);
    }

}

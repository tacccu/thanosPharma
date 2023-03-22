/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.services;

import com.thanosPharma.logic.entities.Producto;
import java.util.List;

/**
 *
 * @author Kiwi
 */
public interface ProductoServiceInterface {

    public List<Producto> listProductos();

    public void saveProduct(Producto producto);

    public void deleteProduct(Producto producto);

    public Producto searchProduct(Producto producto);

}

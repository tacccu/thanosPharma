/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.data.services;

import com.thanosPharma.logic.entities.Producto;
import java.util.List;

/**
 *
 * @author Kiwi
 */
public interface ProductoService {

    public List<Producto> listProductos();

    public void guardar(Producto producto);

    public void borrar(Producto producto);

}

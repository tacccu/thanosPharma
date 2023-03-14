/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.entities;

import lombok.Data;

/**
 *
 * @author Kiwi
 */
@Data
@Entity
@Table(name="DetalleVenta")
public class DetalleVenta {
    private static final long serialVersionUID = 1l;
    
    private Producto producto;
    private int idVenta;
    private int cantidad;
    private double precioUnitario;
    private int iva;
    private double totalProducto;
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Kiwi
 */
@Data
@Entity
@Table(name = "detalle_venta")
public class DetalleVenta implements Serializable {

    private static final long serialVersionUID = 1l;

    @ManyToOne
    @JoinColumn(name = "ordenes_de_venta_id_venta")
    private OrdenVenta ordenVenta;

    @OneToOne
    @JoinColumn(name = "productos_codigo_nacional")
    private Producto producto;

    private int cantidad;
    private double totalProducto;
}

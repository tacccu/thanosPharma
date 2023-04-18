/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @Id
    private Long ordenVenta;

    @NotNull(message = "El nombre del producto ha de tener algún valor") 
    @NotEmpty(message = "El nombre del producto no puede estar vacío")  
    @Size(max = 100)
    private Producto producto;
    
    @NotNull(message = "La cantidad no puede ser nula") 
    private int cantidad;
    
    @NotNull(message = "El precio unitario no puede ser nulo") 
    private double precioUnitario;
    
    @Min(value = 0, message = "El iva no puede ser negativo") 
    @Max(value = 21, message = "El iva no puede superar el 21%") 
    private int iva;
    
    @NotNull(message = "El precio total no puede ser nulo") 
    private double totalProducto;

}

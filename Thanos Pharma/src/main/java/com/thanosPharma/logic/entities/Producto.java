/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "productos")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    @Min(value = 100000, message = "El codigo nacional no puede ser un número menor a 100000") 
    @Max(value = 999999, message = "El codigo nacional no puede ser un número mayor a 999999") 
    private int codigoNacional;
    
    private boolean receta;
    
    @Min(value = 0, message = "El stock no puede ser negativo") 
    private int stock;
    
    @NotNull(message = "El nombre del producto ha de tener algún valor") 
    @NotEmpty(message = "El nombre del producto no puede estar vacío")  
    @Size(max = 100)
    private String nombreProducto;
    
    @Size(max = 200)
    private String descripcion;
    
    @Min(value = 1, message = "Las unidades de embalaje no pueden ser inferior a 1") 
    private int unidadesEmbalaje;
    
    @NotNull(message = "La dosis ha de tener algún valor") 
    @NotEmpty(message = "La dosis no puede estar vacía")  
    private String dosis;
    
    @Min(value = 0, message = "El precio del producto no puede ser negativo") 
    private float precio;
    
    @Min(value = 0, message = "El iva no puede ser negativo") 
    @Max(value = 21, message = "El iva no puede superar el 21%") 
    private int iva;
}

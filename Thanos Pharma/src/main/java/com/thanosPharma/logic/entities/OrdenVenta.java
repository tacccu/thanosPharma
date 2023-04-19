/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Kiwi
 */
@Data
@Entity
@Table(name = "ordenes_de_venta")
public class OrdenVenta implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "El id de venta no puede ser nulo")
    int id_venta;

    @NotNull(message = "El campo de usuario no puede ser nulo")
    Usuario usuario;

    @NotNull(message = "El campo de cliente no puede ser nulo")
    Cliente cliente;

    @NotNull(message = "El precio total no puede ser nulo")
    double precio_total;

    @NotNull(message = "El estado ha de tener algún valor")
    String estado;

    @NotNull(message = "El orden de venta ha de tener algún valor")
    String ordenes_de_ventacol;
    
    Date fecha_venta;

    @OneToMany//Verificar primero el tipo de cascade(cascade = {CascadeType.ALL})
    private List<DetalleVenta> detallesVentaList;

}

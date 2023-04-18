/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.entities;

import jakarta.persistence.*;
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
    Long id_venta;

    Usuario usuario;
    Cliente cliente;

    double precio_total;
    String estado;
    Date fecha_venta;
    

    @OneToMany//Verificar primero el tipo de cascade(cascade = {CascadeType.ALL})
    private List<DetalleVenta> detallesVentaList;

}

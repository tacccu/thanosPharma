/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.logic.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
@Table(name = "clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;
    @NotEmpty
    @Size(min = 12, max = 12, message="${formClientes.error.tse}")
    private String tse;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String direccion;
    @NotEmpty
    private String municipio;
    @NotEmpty
    @Email
    private String email;
    @NotNull
    @Min(5)
    @Max(5)
    private int codigo_postal;
    @NotNull
    @Min(9)
    @Max(9)
    private int telefono;
}

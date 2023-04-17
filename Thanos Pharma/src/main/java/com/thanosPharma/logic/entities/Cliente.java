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
    @Size(min = 12, max = 13, message="${formClientes.error.tse}, debe introducir 12 carácteres")
    private String tse;
    @NotEmpty(message="${formClientes.error.nombre}, Debe introducir un nombre válido")
    private String nombre;
    @NotEmpty(message="${formClientes.error.apellido}, Debe introducir un apellido válido")
    private String apellido;
    @NotEmpty(message="${formClientes.error.direccion}, Debe introducir una dirección válida")
    private String direccion;
    @NotEmpty(message="${formClientes.error.municipio}, Debe introducir un municipio válido")
    private String municipio;
    @NotEmpty
    @Email(message="${formClientes.error.email}, Introduzca un mail válido")
    private String email;
    @NotNull
    @Min(11111)
    @Max(value=99999, message="${formClientes.error.codigo_postal}, Introduzca 5 digitos pertenecientes al CP del cliente")
    private int codigo_postal;
    @NotNull
    @Min(11111111)
    @Max(value=999999999, message="${formClientes.error.nombre}, Introduzca un número de teléfono válido")
    private int telefono;
}

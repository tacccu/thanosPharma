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
    @NotEmpty(message="Debe introducir una tarjeta sanitaria")
    @Size(min = 12, max = 13, message="Debe introducir 12 carácteres")
    private String tse;
    @NotEmpty(message="Debe introducir un nombre válido")
    private String nombre;
    @NotEmpty(message="Debe introducir un apellido válido")
    private String apellido;
    @NotEmpty(message="Debe introducir una dirección válida")
    private String direccion;
    @NotEmpty(message="Debe introducir un municipio válido")
    private String municipio;
    @NotEmpty(message="Introduzca un mail válido")
    @Email(message="Introduzca un mail válido")
    private String email;
    @NotNull(message="Introduzca 5 digitos pertenecientes al CP del cliente")
    @Min(value=11111, message="Introduzca 5 digitos pertenecientes al CP del cliente")
    @Max(value=99999, message="Introduzca 5 digitos pertenecientes al CP del cliente")
    private int codigo_postal;
    @NotNull(message="Introduzca un número de teléfono válido")
    @Min(value=111111111, message="Introduzca un número de teléfono válido")
    @Max(value=999999999, message="Introduzca un número de teléfono válido")
    private int telefono;
}

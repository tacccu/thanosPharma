/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma.dao;

import com.thanosPharma.logic.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Kiwi
 */
public interface ClienteDAO extends CrudRepository<Cliente, Long> {

}

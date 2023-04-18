/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import com.thanosPharma.logic.entities.OrdenVenta;
import com.thanosPharma.logic.entities.Producto;
import com.thanosPharma.logic.services.OrdenVentaService;
import com.thanosPharma.logic.services.ProductoService;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author benal
 */
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdenVentaCRUDTest {
    @Autowired
    private OrdenVentaService ordenVentaService;
    
    private OrdenVenta venta;

        
    @DisplayName("JUnit test para verificar la creación de una nueva orden de venta")
    @Test
    @Order(1)
    public void crearNuevoProductoTest(){
         ordenVentaService.guardar(venta);
         Assertions.assertThat(ordenVentaService.searchSale(venta)).as("La orden de venta pedida no está en la bbdd").isNotNull();
    }
    
    @DisplayName("JUnit test para verificar la búsqueda de todas las ordenes de venta")
    @Test
    @Order(2)
    public void listProductosTest(){
        List<OrdenVenta> productosBBDD = ordenVentaService.listOrdenesVenta();
        OrdenVenta VentaBuscado = productosBBDD.stream()
                                                .filter(p -> p.getId_venta()== venta.getId_venta())
                                                .findFirst()
                                                .orElse(null);
        Assertions.assertThat(VentaBuscado).as("listProductosTest - Una orden de venta esperada no está en la bbdd").isNotNull();
    }
    
    @DisplayName("JUnit test para verificar la eliminación de una orden de venta")
    @Test
    @Order(3)
    public void borrarProductoTest(){
        ordenVentaService.borrar(venta);
        Assertions.assertThat(ordenVentaService.searchSale(venta)).as(" La orden de venta eliminada debería ser null").isNull();
    }
}

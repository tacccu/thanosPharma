/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import com.thanosPharma.logic.services.ProductoService;
import com.thanosPharma.logic.entities.Producto;
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
 * @author Kiwi
 */
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductoCRUDTest {

    @Autowired
    private ProductoService productoService;

    private Producto producto;

    @BeforeEach
    void inicializar() {
        producto = new Producto();
        producto.setCodigoNacional(123456);
        producto.setDescripcion("Nueva formula activa para evitar los dolores de cabeza.");
        producto.setDosis("400 mg");
        producto.setIva(4);
        producto.setNombreProducto("Cabecinfreno");
        producto.setPrecio(1.10f);
        producto.setReceta(true);
        producto.setStock(3000);
        producto.setUnidadesEmbalaje(1);
    }

    @DisplayName("JUnit test para verificar la creación de un nuevo producto")
    @Test
    @Order(1)
    public void crearNuevoProductoTest() {
        productoService.saveProduct(producto);
        Assertions.assertThat(productoService.searchProduct(producto)).as("crearNuevoProductoTest - El producto guardado no está en la bbdd").isNotNull();
    }

    @DisplayName("JUnit test para verificar la creación de un nuevo producto")
    @Test
    @Order(2)
    public void modificarProductoTest() {
        Producto p = productoService.searchProduct(producto);
        p.setStock(200);
        p.setUnidadesEmbalaje(24);
        productoService.saveProduct(p);
        Producto productoModificado = productoService.searchProduct(producto);
        Assertions.assertThat(productoModificado).as("modificarProductoTest - El producto modificado no está en la bbdd").isNotNull();
        Assertions.assertThat(productoModificado.getStock()).as("modificarProductoTest - El stock del producto no se ha modificado correctamente").isEqualTo(200);
        Assertions.assertThat(productoModificado.getUnidadesEmbalaje()).as("modificarProductoTest - Las unidades de embalaje del producto no se han modificado correctamente").isEqualTo(24);
    }

    @DisplayName("JUnit test para verificar la búsqueda de todos los productos")
    @Test
    @Order(3)
    public void listProductosTest() {
        List<Producto> productosBBDD = productoService.listProductos();
        Producto productoBuscado = productosBBDD.stream()
                .filter(p -> p.getCodigoNacional() == producto.getCodigoNacional())
                .findFirst()
                .orElse(null);
        Assertions.assertThat(productoBuscado).as("listProductosTest - Uno de los productos esperados no está en la bbdd").isNotNull();
    }

    @DisplayName("JUnit test para verificar la eliminación de un producto")
    @Test
    @Order(4)
    public void borrarProductoTest() {
        productoService.deleteProduct(producto);
        Assertions.assertThat(productoService.searchProduct(producto)).as("borrarProductoTest - El producto eliminado debería ser null").isNull();
    }

}

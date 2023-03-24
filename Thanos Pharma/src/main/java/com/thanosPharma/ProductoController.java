/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import com.thanosPharma.logic.entities.Producto;
import com.thanosPharma.logic.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Kiwi
 */
@Controller
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public String homeProductos(Model model) {

        model.addAttribute("productos", productoService.listProductos());

        return "mainProductos";
    }

    @GetMapping("formProductos")
    public String formProductos(Model model) {

        return "formProductos";
    }

    @PostMapping("/saveProduct")
    public String saveProducto(Producto producto) {

        productoService.saveProduct(producto);

        return "redirect:/productos";
    }

    @GetMapping("/modify/{codigoNacional}")
    public String modifyProducto(Producto producto, Model model) {

        model.addAttribute("producto", productoService.searchProduct(producto));
        model.getAttribute("selectedProducto");

        return "formProductos";
    }

    @GetMapping("/delete/{codigoNacional}")
    public String deleteProducto(Producto producto) {

        productoService.deleteProduct(producto);

        return "redirect:/mainProductos";
    }

}

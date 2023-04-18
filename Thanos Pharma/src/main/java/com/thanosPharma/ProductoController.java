 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import com.thanosPharma.logic.entities.Producto;
import com.thanosPharma.logic.services.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

    @GetMapping("/formProductos")
    public String formProductos(Producto producto) {

        return "formProductos";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@Valid Producto producto, BindingResult br) {
        if (br.hasErrors()) {
            return "formProductos";
        }
        productoService.saveProduct(producto);

        return "redirect:/productos";
    }

    @GetMapping("/modifyProducto/{codigoNacional}")
    public String modifyProducto(Producto producto, Model model) {

        model.addAttribute("producto", productoService.searchProduct(producto));
        model.addAttribute("isAModification", true);

        return "formProductos";
    }

    @GetMapping("/deleteProducto/{codigoNacional}")
    public String deleteProducto(Producto producto) {

        productoService.deleteProduct(producto);

        return "redirect:/productos";
    }

}

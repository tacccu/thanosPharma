/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Kiwi
 */
@Controller
public class MainController {
    
    @GetMapping("/")
    public RedirectView showlogin(Model model){
        return new RedirectView("/productos");
    }
   

}

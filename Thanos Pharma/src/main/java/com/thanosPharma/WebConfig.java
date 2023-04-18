/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author benal
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
     @Override
    public void addViewControllers(ViewControllerRegistry registre) {
//        registre.addViewController("/").setViewName("login");
        registre.addViewController("/login").setViewName("login");
        registre.addViewController("/menu").setViewName("/menu");
    }
}

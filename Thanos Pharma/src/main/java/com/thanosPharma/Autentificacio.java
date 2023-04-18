/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanosPharma;

import Utils.Encoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

/**
 *
 * @author benal
 */
@Configuration
@EnableWebSecurity

public class Autentificacio {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    public void autenticacio(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        String[] resources = {"/css/style.css"};

        return http.authorizeHttpRequests((requests) -> requests
                .requestMatchers(resources).permitAll()
                .requestMatchers("/productos").hasAnyAuthority("admin")
                .anyRequest().authenticated()
        )
                .formLogin((form) -> {
            try {
                form
                        .loginPage("/login")
                        .loginProcessingUrl("/login")
                        .permitAll()
                        .and().logout().logoutSuccessUrl("/").permitAll();
            } catch (Exception ex) {
                Logger.getLogger(Autentificacio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                        
                )
                
                
                .exceptionHandling((exception) -> exception
                .accessDeniedPage("/template/error403"))
                .build();

    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder codificador = new BCryptPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser("usuario1").password(codificador.encode("123")).roles("lroldan")
                .and()
                .withUser("usuario2").password(codificador.encode("admin")).roles("ADMIN");
    }

}

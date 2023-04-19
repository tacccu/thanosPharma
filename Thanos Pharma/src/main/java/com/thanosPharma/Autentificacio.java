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
                .requestMatchers("/**").hasAnyAuthority("admin", "user")
                .anyRequest().authenticated()
        )
                .formLogin((form) -> {
                    form
                            .loginPage("/login")
                            .loginProcessingUrl("/login")
                            .permitAll();

                }
                )
                .exceptionHandling((exception) -> exception
                .accessDeniedPage("/template/error403"))
                .logout()
                .permitAll()
                .and()
                .build();

    }

}

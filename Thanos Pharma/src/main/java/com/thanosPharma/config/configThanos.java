///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.thanosPharma.config;
//
//import org.springframework.context.MessageSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.support.ReloadableResourceBundleMessageSource;
//import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
//
///**
// *
// * @author dolorioUser
// */
//public class configThanos {
//    
//    @Bean
//    public MessageSource messageResource() {
//        ReloadableResourceBundleMessageSource messageSource = 
//                new ReloadableResourceBundleMessageSource();
//        messageSource.setBasename("classpath:errors");
//        messageSource.setDefaultEncoding("UTF-8");
//        
//        return messageSource;
//    }
//    
//    
//    @Bean
//    public LocalValidatorFactoryBean getValidator() {
//        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
//        bean.setValidationMessageSource(messageResource());
//        return bean;
//    }
//            
//            
//}

package com.durgadashaldar.genericnotificationsystem.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableAutoConfiguration
@EnableSwagger2

public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        
        		 return new Docket(DocumentationType.SWAGGER_2)
        	                .select()
        	                .apis(RequestHandlerSelectors.any())
        	                .paths(PathSelectors.any())
        	                .build();
        	    }
    }
    
    


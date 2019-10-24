package com.vroomcar.vroomcar.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()                 .apis(RequestHandlerSelectors.basePackage("com.vroomcar.vroomcar.controller"))
                .paths(regex("/VroomCar.*"))
                .build();
    }
    private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Vroomcar Rest API")
				.description("VroomCar API for riders")
				.termsOfServiceUrl("http://vroomcar.com")
				.contact("jabce@gmail.com").license("Vroomcar License")
				.licenseUrl("abc@gmail.com").version("1.0").build();
		
   
    }
    }

package com.chavan.blog.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Blogging Application : Backend Course",
        description = "This project is developed by Learn Code With Durgesh",
        version = "1.0",
        termsOfService = "Terms of Service",
        contact = @Contact(name = "Durgesh", url = "https://learncodewithdurgesh.com", email = "learncodewithdurgesh@gmail.com"),
        license = @io.swagger.v3.oas.annotations.info.License(name = "License of APIS", url = "API license URL")
    ),
    security = @SecurityRequirement(name = "JWT")
)
@SecuritySchemes({
    @SecurityScheme(
        name = "JWT",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        bearerFormat = "JWT"
    )
})
public class SwaggerConfig {
}
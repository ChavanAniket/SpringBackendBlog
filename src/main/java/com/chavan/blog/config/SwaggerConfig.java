package com.chavan.blog.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Blogging Application : Backend Course",
        description = "This project is developed by Aniket",
        version = "1.0",
        contact = @Contact(name = "Durgesh", url = "https://google.com", email = "akc@gmail.com"),
        termsOfService = "Terms of Service"
    )
)
public class SwaggerConfig {
}
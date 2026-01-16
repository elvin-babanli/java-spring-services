package com.example.product;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "FirstRestAPI", version = "1.0", description = "Task 2 - Product REST API"))
public class FirstRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstRestApiApplication.class, args);
    }
}

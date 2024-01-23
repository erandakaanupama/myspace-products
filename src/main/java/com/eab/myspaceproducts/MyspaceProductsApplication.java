package com.eab.myspaceproducts;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Products microservices REST API Documentation",
                description = "REST API documentation for Products",
                version = "0.0.1",
                contact = @Contact(
                        name = "Erandaka Bandara",
                        email = "erandakaanupama@gmail.com"
                ),
                license = @License(
                        name = "Apache 2.0"
                )
        ))
public class MyspaceProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspaceProductsApplication.class, args);
    }

}

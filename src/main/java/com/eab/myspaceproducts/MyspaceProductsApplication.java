package com.eab.myspaceproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
public class MyspaceProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspaceProductsApplication.class, args);
	}

}

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.Entities")

public class SeleccioneszApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeleccioneszApplication.class, args);
	}

}

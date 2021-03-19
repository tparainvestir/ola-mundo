package com.tempoparainvestir.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OlaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlaMundoApplication.class, args);
		System.out.println("Olá Mundo");
	}

}

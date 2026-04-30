package com.desafio.globaltracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients; // Adicione este import

@SpringBootApplication
@EnableFeignClients 
public class GlobaltrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobaltrackerApplication.class, args);
	}

}
package com.uce.edu.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoU1Xp1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1Xp1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer deber con Spring Framework");
	}

}

package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cortica2Application 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(Cortica2Application.class, args);

		System.out.println("Application started. Please open your browser and navigate to:");
		System.out.println("http://localhost:8080/");
	}
}

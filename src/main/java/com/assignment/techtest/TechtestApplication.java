package com.assignment.techtest;

import java.time.Instant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechtestApplication.class, args);
		LocationLogic location = new LocationLogic();
	}
}

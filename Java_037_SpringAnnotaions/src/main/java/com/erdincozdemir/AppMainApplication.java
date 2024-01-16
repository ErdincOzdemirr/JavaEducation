package com.erdincozdemir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.erdincozdemir")

public class AppMainApplication {

	public static void main(String[] args) {

		SpringApplication.run(AppMainApplication.class, args);
	}
}

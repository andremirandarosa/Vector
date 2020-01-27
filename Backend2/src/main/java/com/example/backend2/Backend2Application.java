package com.example.backend2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Backend2Application {

	public static void main(String[] args) {
		SpringApplication.run(Backend2Application.class, args);
	}

}

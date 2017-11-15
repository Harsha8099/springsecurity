package com.sample.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.sample.config.SecurityConfig;
import com.sample.controller.MainController;

@SpringBootApplication
@Import({MainController.class,SecurityConfig.class})
public class MainApp {
	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class App11Application {
	
	@GetMapping("/")
	public String home() {
		return "Docker app 1 >>>> hello >>>> one more";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(App11Application.class, args);
	}

}

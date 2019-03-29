package com.example;

import com.example.entity.Database;
import com.example.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Bean
	User getUser(){
		User user = new User();
		user.setUsername("Mansi");
		user.setPassword("mansi");
		return user;
	}

	@Bean
	Database getDatabase(){
		return new Database();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

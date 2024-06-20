package com.pradeephv.jpa;

import com.github.javafaker.Faker;
import com.pradeephv.jpa.models.Author;
import com.pradeephv.jpa.models.Video;
import com.pradeephv.jpa.repositories.AuthorRespository;

import com.pradeephv.jpa.repositories.VideoRespository;
import com.pradeephv.jpa.service.AuthorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpaApplication.class, args);
		System.out.println("Hello");
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorService authorService) {
		return args -> {
			authorService.findAuthorsByAge(36)
					.forEach(System.out::println);
		};
	}

}

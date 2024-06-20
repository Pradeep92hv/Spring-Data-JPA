package com.pradeephv.jpa;

import com.github.javafaker.Faker;
import com.pradeephv.jpa.models.Author;
import com.pradeephv.jpa.models.Video;
import com.pradeephv.jpa.repositories.AuthorRespository;

import com.pradeephv.jpa.repositories.VideoRespository;
import com.pradeephv.jpa.service.AuthorService;
import com.pradeephv.jpa.specification.AuthorSpecification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

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
	public CommandLineRunner commandLineRunner(
			AuthorService authorService,
			AuthorRespository respository
	) {
		return args -> {
//			authorService.findAuthorsByAge(36)
//					.forEach(System.out::println);

			Specification<Author> spec=Specification
					.where(AuthorSpecification.hasage(36))
					.or(AuthorSpecification.firstnameLike("pr"));

			//respository.findAll(spec).forEach(System.out::println);


		};
	}

}

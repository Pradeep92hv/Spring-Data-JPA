package com.pradeephv.jpa;

import com.github.javafaker.Faker;
import com.pradeephv.jpa.models.Author;
import com.pradeephv.jpa.models.Video;
import com.pradeephv.jpa.repositories.AuthorRespository;

import com.pradeephv.jpa.repositories.VideoRespository;
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

	//@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRespository repository,
			VideoRespository videoRespository
			) {
		return args -> {

			Faker faker=new Faker();
			List<Author> authors = new ArrayList<>();

			for (int i = 0; i < 50; i++) {
				Author author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(20, 70))
						.email("contact"+i+"@gmail.com")
						.build();
				authors.add(author);
			}

			repository.saveAll(authors);
			System.out.println("50 authors added to the database.");


			/*var author = Author.builder()
					.firstName("pradee")

					.lastName("hv")
					.age(20)
					.email("p@gmail.com")
//					.createdAt(LocalDateTime.now()) // Set createdAt explicitly
					.build();
			repository.save(author);

			 */

			/*
			var video = Video.builder()
					.name("abhhhc")
					.length(5)
					.build();
			videoRespository.save(video);
//			logger.info("Video saved successfully with ID: {}", video.getId());

			 */

		};
	}

}

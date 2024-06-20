package com.pradeephv.jpa;

import com.pradeephv.jpa.models.Author;
import com.pradeephv.jpa.models.Video;
import com.pradeephv.jpa.repositories.AuthorRespository;

import com.pradeephv.jpa.repositories.VideoRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpaApplication.class, args);
		System.out.println("Hello");
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRespository repository,
			VideoRespository videoRespository
			) {
		return args -> {
			/*var author = Author.builder()
					.firstName("pradee")

					.lastName("hv")
					.age(20)
					.email("p@gmail.com")
//					.createdAt(LocalDateTime.now()) // Set createdAt explicitly
					.build();
			repository.save(author);

			 */

			var video = Video.builder()
					.name("abc")
					.length(5)
					.build();
			videoRespository.save(video);
//			logger.info("Video saved successfully with ID: {}", video.getId());

		};
	}

}

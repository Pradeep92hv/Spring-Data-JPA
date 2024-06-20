package com.pradeephv.jpa.repositories;

import com.pradeephv.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRespository extends JpaRepository<Author, Integer> {

    List<Author> findAllByFirstName(String fn);

    List<Author> findAllByFirstNameIgnoreCase(String fn);

    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

    List<Author> findAllByFirstNameStartingWithIgnoreCase(String fn); // corrected method name

    List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);

    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstname);
}

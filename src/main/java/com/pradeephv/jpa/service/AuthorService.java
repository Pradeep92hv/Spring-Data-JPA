package com.pradeephv.jpa.service;

import com.pradeephv.jpa.models.Author;
import com.pradeephv.jpa.repositories.AuthorRespository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRespository authorRepository;

    public AuthorService(AuthorRespository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional(readOnly = true)
    public List<Author> findAuthorsByAge(int age) {
        List<Author> authors = authorRepository.findByNamedQuery(age);
        authors.forEach(author -> author.getCourses().size());// Initialize lazy collection
        return authors;
    }
}
//h

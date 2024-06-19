package com.pradeephv.jpa.repositories;

import com.pradeephv.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRespository extends JpaRepository<Author,Integer> {

}

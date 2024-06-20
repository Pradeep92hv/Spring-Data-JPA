package com.pradeephv.jpa.repositories;

import com.pradeephv.jpa.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRespository extends JpaRepository<Author, Integer> {

    List<Author> findAllByFirstName(String fn);

    List<Author> findAllByFirstNameIgnoreCase(String fn);

    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

    List<Author> findAllByFirstNameStartingWithIgnoreCase(String fn); // corrected method name

    List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);

    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstname);

    @Modifying
    @Transactional
    @Query("update Author a set a.age= :age where a.id= :id")
    void updateAuthor(int age,int id);

    List<Author> findByNamedQuery(@Param("age") int age);
}

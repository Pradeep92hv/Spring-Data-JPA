package com.pradeephv.jpa.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@NoArgsConstructor
@Data   // give setter ,getter
@Table
@Entity  //Specifies that the class is an entity. This annotation is applied to the entity class.
public class Author {

    @Id  //Specifies the primary key of an entity
    @GeneratedValue
//            (strategy = GenerationType.SEQUENCE,
//            generator = "author_sequence"
//    )
//    //to create out own sequence
//    @SequenceGenerator(
//            name = "author_sequence",
//            sequenceName = "author_sequence",
//            allocationSize = 2
//    )
    private  Integer id=null;
    @Column(
            name = "f_name",
            length = 35
    )
    private String firstName;

    private String lastName;

    @Column(
            unique = true,
            nullable = false)
    private String email;

    private  int age;
    @Column(
            updatable = false,
            nullable = false

    )
     private LocalDateTime createdAt;

    @Column(
            insertable = false
    )
    private LocalDateTime lastModified;




}

package com.pradeephv.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "resource_type", discriminatorType = DiscriminatorType.STRING) // Example with DiscriminatorType.STRING
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;

    private  String name;


    private String url;

    private int size;

    @OneToOne
    @JoinColumn(name = "lecture_id")
   private Lecture lecture;


}

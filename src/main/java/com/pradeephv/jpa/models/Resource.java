package com.pradeephv.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Resource extends  BaseEntity{


    private  String name;


    private String url;

    private int size;

    @OneToOne
    @JoinColumn(name = "lecture_id")
   private Lecture lecture;


}

package com.pradeephv.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Section {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int oder;

//    @ManyToOne
//    @JoinColumn(
//            name = "course_id"
//    )
//    private List<Course> courses;
}

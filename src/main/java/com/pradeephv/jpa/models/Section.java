package com.pradeephv.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Section extends BaseEntity{



    private String name;

    private int oder;

    @ManyToOne
    @JoinColumn(
            name = "course_id"
    )
    private Course courses;

    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
}

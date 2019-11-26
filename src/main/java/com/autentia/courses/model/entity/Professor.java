package com.autentia.courses.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "course_professor",
            joinColumns = @JoinColumn(name="course_id"),inverseJoinColumns = @JoinColumn(name="professor_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"course_id","professor_id"})})
    private List<Course> courseList;
}

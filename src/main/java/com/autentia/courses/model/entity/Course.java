package com.autentia.courses.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "level")
    private String level;
    @Column(name = "hours")
    private Integer hours;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "course_professor",
            joinColumns = @JoinColumn(name="course_id"),inverseJoinColumns = @JoinColumn(name="professor_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"course_id","professor_id"})})
    private Professor professor;


    public Course(String title, Boolean active, String professor, String level, Integer hours) {
        this.title = title;
        this.active = active;
        this.level = level;
        this.hours = hours;
    }
}

package com.autentia.courses.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

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
    @Column(name = "professor")
    private String professor;
    @Column(name = "level")
    private String level;
    @Column(name = "hours")
    private Integer hours;

    public Course(String title, Boolean active, String professor, String level, Integer hours) {
        this.title = title;
        this.active = active;
        this.professor = professor;
        this.level = level;
        this.hours = hours;
    }
}

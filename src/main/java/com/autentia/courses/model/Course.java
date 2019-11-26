package com.autentia.courses.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@Entity
@Table(name = "course")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private Boolean active;
    @Column(name = "professor")
    private String professor;
    @Column(name = "title")
    private String title;
    @Column(name = "level")
    private String level;
    @Column(name = "hours")
    private Integer hours;
}

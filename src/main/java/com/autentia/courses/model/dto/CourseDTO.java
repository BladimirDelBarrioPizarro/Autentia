package com.autentia.courses.model.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CourseDTO {
    private Long id;
    private String title;
    private String professor;
    private String level;
    private Integer hours;
    private Boolean active;

    public CourseDTO(Long id, String title, String professor, String level, Integer hours, Boolean active) {
        this.id = id;
        this.title = title;
        this.professor = professor;
        this.level = level;
        this.hours = hours;
        this.active = active;
    }
}

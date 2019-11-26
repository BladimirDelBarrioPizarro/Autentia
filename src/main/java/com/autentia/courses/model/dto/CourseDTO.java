package com.autentia.courses.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CourseDTO {
    private String title;
    private Long id;
    private Boolean active;
    private String professor;
    private String level;
    private Integer hours;
}

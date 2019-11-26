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
}

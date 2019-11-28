package com.autentia.courses.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfessorDTO {
    private Long id;
    private String name;
}

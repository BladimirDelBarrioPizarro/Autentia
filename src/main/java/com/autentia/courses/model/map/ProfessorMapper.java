package com.autentia.courses.model.map;

import com.autentia.courses.model.dto.ProfessorDTO;
import com.autentia.courses.model.entity.Professor;
import java.util.List;
import java.util.stream.Collectors;

public class ProfessorMapper {
    public static List<ProfessorDTO> mapProfessorsListToProfessorDTOList(List<Professor> professors) {
        return professors.stream().map(professor-> mapProfessorToProfessorDTO(professor)).collect(Collectors.toList());
    }

    private static ProfessorDTO mapProfessorToProfessorDTO(Professor professor) {
        return ProfessorDTO.builder()
                .id(professor.getId())
                .name(professor.getName())
                .build();
    }
}

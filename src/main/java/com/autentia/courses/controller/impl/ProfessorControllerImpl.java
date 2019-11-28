package com.autentia.courses.controller.impl;

import com.autentia.courses.controller.ProfessorController;
import com.autentia.courses.model.dto.ProfessorDTO;
import com.autentia.courses.service.ProfessorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Slf4j
public class ProfessorControllerImpl implements ProfessorController {

    private ProfessorService professorService;

    public ProfessorControllerImpl(ProfessorService professorService){
        this.professorService = professorService;
    }

    @Override
    public ResponseEntity<List<ProfessorDTO>> getProfessors() {
        log.info(" -- GET /professors");
        return new ResponseEntity<>(professorService.getProfessors(), HttpStatus.OK);
    }
}

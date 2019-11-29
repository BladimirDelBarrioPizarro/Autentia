package com.autentia.courses.controller.impl;

import com.autentia.courses.controller.ProfessorController;
import com.autentia.courses.model.dto.ProfessorDTO;
import com.autentia.courses.service.ProfessorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Slf4j
public class ProfessorControllerImpl implements ProfessorController {

    private ProfessorService professorService;
    private EntityLinks entityLinks;

    public ProfessorControllerImpl(ProfessorService professorService,EntityLinks entityLinks){
        this.professorService = professorService;
        this.entityLinks = entityLinks;
    }

    @Override
    public ResponseEntity<List<ProfessorDTO>> getProfessors() {
        log.info(" -- GET /professors");
        return new ResponseEntity<>(professorService.getProfessors(), HttpStatus.OK);
    }
}

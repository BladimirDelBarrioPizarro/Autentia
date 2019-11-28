package com.autentia.courses.controller;

import com.autentia.courses.model.dto.ProfessorDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public interface ProfessorController {
    @GetMapping(path="/professors",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<ProfessorDTO>> getProfessors();
}

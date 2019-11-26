package com.autentia.courses.controller;

import com.autentia.courses.model.dto.CourseDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public interface CourseController {
    @GetMapping(path="/course",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<CourseDTO>> findAllByActive(@Param("pageable") Pageable pageable);
}

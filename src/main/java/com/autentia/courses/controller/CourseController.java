package com.autentia.courses.controller;

import com.autentia.courses.model.dto.CourseDTO;
import com.autentia.courses.model.entity.Course;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/api/v1")
public interface CourseController {
    @GetMapping(path="/course",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<CourseDTO>> findAllByActive(@Param("pageable") Pageable pageable);

    @PostMapping(path = "/course",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<EntityModel<Links>> insertCourse(@RequestBody Course course);
}

package com.autentia.courses.controller.impl;

import com.autentia.courses.controller.CourseController;
import com.autentia.courses.model.dto.CourseDTO;
import com.autentia.courses.model.entity.Course;
import com.autentia.courses.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Slf4j
public class CourseControllerImpl implements CourseController {

    private CourseService courseService;

    public CourseControllerImpl(CourseService courseService){
        this.courseService = courseService;
    }

    @Override
    public ResponseEntity<List<CourseDTO>> findAllByActive(Pageable pageable) {
        log.info(" -- GET /course");
        return new ResponseEntity<>(courseService.findAllByActive(pageable), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CourseDTO> insertCourse(Course course) {
        log.info(" -- POST /course");
        return new ResponseEntity<>(courseService.insertCourse(course),HttpStatus.OK);
    }
}

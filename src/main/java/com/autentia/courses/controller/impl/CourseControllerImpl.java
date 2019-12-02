package com.autentia.courses.controller.impl;

import com.autentia.courses.controller.CourseController;
import com.autentia.courses.model.dto.CourseDTO;
import com.autentia.courses.model.entity.Course;
import com.autentia.courses.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Links;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



import java.util.List;
import java.util.Objects;

@Slf4j
public class CourseControllerImpl implements CourseController {

    private CourseService courseService;
    private EntityLinks entityLinks;
    public CourseControllerImpl(CourseService courseService,EntityLinks entityLinks){
        this.courseService = courseService;
        this.entityLinks = entityLinks;
    }

    @Override
    public ResponseEntity<List<CourseDTO>> findAllByActive(Pageable pageable) {
        log.info(" -- GET /course");
        return new ResponseEntity<>(courseService.findAllByActive(pageable), HttpStatus.OK);
    }

    @Override
    public ResponseEntity insertCourse(Course course) {
        log.info(" -- POST /course");
        EntityModel<CourseDTO> entity = new EntityModel<>(courseService.insertCourse(course));
        entity.add(entityLinks.linkToItemResource(Course.class, Objects.requireNonNull(course.getId())));
        Links links = entity.getLinks();
        return new ResponseEntity(links,HttpStatus.OK);
    }
}

package com.autentia.courses.service;

import com.autentia.courses.model.dto.CourseDTO;
import com.autentia.courses.model.entity.Course;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CourseService {
    List<CourseDTO> findAllByActive(Pageable pageable);
    CourseDTO insertCourse(Course course);
}

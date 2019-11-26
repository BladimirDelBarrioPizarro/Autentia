package com.autentia.courses.service.impl;

import com.autentia.courses.dao.CourseDao;
import com.autentia.courses.dao.ProfessorDao;
import com.autentia.courses.model.dto.CourseDTO;
import com.autentia.courses.model.entity.Course;
import com.autentia.courses.model.entity.Professor;
import com.autentia.courses.model.map.CourseMapper;
import com.autentia.courses.service.CourseService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.stream.Collectors;

public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao;


    public CourseServiceImpl(CourseDao courseDao){
        this.courseDao = courseDao;
    }

    @Override
    public List<CourseDTO> findAllByActive(Pageable pageable) {
        pageable = pageRequest(pageable);
        List<Course> courseList = courseDao.findAll(pageable).stream().filter(Course::getActive).collect(Collectors.toList());
        return CourseMapper.mapListCourseToListCourseDTO(courseList);
    }

    private PageRequest pageRequest(Pageable pageable){
        Sort sort = pageable.getSort();
        return PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
    }
}

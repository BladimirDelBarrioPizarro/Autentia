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
    private ProfessorDao professorDao;

    public CourseServiceImpl(CourseDao courseDao,ProfessorDao professorDao){
        this.courseDao = courseDao;
        this.professorDao = professorDao;
    }

    @Override
    public List<CourseDTO> findAllByActive(Pageable pageable) {
        pageable = pageRequest(pageable);
        List<Professor> professorList = professorDao.findAll(pageable).stream().filter(item->item.getCourseList().get(0).getActive()).collect(Collectors.toList());
        List<Course> courseList = courseDao.findAll(pageable).stream().filter(Course::getActive).collect(Collectors.toList());
        return CourseMapper.mapListCourseToListCourseDTO(courseList);
    }

    private PageRequest pageRequest(Pageable pageable){
        Sort sort = pageable.getSort();
        return PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
    }
}

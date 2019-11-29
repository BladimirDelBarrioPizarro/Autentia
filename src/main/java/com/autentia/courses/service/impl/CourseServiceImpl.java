package com.autentia.courses.service.impl;

import com.autentia.courses.dao.CourseDao;
import com.autentia.courses.model.dto.CourseDTO;
import com.autentia.courses.model.entity.Course;
import com.autentia.courses.model.exceptions.HandleExceptionPOST;
import com.autentia.courses.model.exceptions.HandleExceptionPagination;
import com.autentia.courses.model.map.CourseMapper;
import com.autentia.courses.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao;

    public CourseServiceImpl(CourseDao courseDao){
        this.courseDao = courseDao;
    }


    @Override
    public List<CourseDTO> findAllByActive(Pageable pageable) {
        pageable = pageRequest(pageable);
        List<Course> courseList;
        try {
            courseList = courseDao.findAll(pageable).stream().filter(Course::getActive).collect(Collectors.toList());
        }catch (Exception ex){
            log.error(" -- ERROR AUTENTIA {}",ex.getMessage());
            throw new HandleExceptionPagination(ex);
        }
        return CourseMapper.mapListCourseToListCourseDTO(courseList);
    }

    @Override
    public CourseDTO insertCourse(Course course) {
        log.info("course {}",course);
        try{
            return CourseMapper.mapCourseToCourseDTO(courseDao.save(course));
        }catch (Exception ex){
            throw new HandleExceptionPOST(ex);
        }
    }

    private PageRequest pageRequest(Pageable pageable){
        Sort sort = pageable.getSort();
        return PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
    }
}

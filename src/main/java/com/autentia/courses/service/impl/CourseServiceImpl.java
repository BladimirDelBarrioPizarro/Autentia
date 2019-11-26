package com.autentia.courses.service.impl;

import com.autentia.courses.dao.CourseDao;
import com.autentia.courses.service.CourseService;

public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao;

    public CourseServiceImpl(CourseDao courseDao){
        this.courseDao = courseDao;
    }
}

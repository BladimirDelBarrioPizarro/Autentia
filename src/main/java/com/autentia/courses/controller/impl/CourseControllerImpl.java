package com.autentia.courses.controller.impl;

import com.autentia.courses.controller.CourseController;
import com.autentia.courses.service.CourseService;

public class CourseControllerImpl implements CourseController {

    private CourseService courseService;

    public CourseControllerImpl(CourseService courseService){
        this.courseService = courseService;
    }
}

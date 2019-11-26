package com.autentia.courses.boot.config;

import com.autentia.courses.controller.CourseController;
import com.autentia.courses.controller.impl.CourseControllerImpl;
import com.autentia.courses.dao.CourseDao;
import com.autentia.courses.dao.ProfessorDao;
import com.autentia.courses.service.CourseService;
import com.autentia.courses.service.impl.CourseServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    public CourseService courseService(CourseDao courseDao, ProfessorDao professorDao){
        return new CourseServiceImpl(courseDao,professorDao);
    }

    @Bean
    public CourseController courseController(CourseService courseService){
        return new CourseControllerImpl(courseService);
    }
}

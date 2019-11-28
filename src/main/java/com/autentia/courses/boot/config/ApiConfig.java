package com.autentia.courses.boot.config;

import com.autentia.courses.controller.CourseController;
import com.autentia.courses.controller.ProfessorController;
import com.autentia.courses.controller.impl.CourseControllerImpl;
import com.autentia.courses.controller.impl.ProfessorControllerImpl;
import com.autentia.courses.dao.CourseDao;
import com.autentia.courses.dao.ProfessorDao;
import com.autentia.courses.service.CourseService;
import com.autentia.courses.service.ProfessorService;
import com.autentia.courses.service.impl.CourseServiceImpl;
import com.autentia.courses.service.impl.ProfessorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    public CourseService courseService(CourseDao courseDao){
        return new CourseServiceImpl(courseDao);
    }


    @Bean
    public ProfessorService professorService(ProfessorDao professorDao){
        return new ProfessorServiceImpl(professorDao);
    }

    @Bean
    public CourseController courseController(CourseService courseService){
        return new CourseControllerImpl(courseService);
    }

    @Bean
    public ProfessorController professorController(ProfessorService professorService){
        return new ProfessorControllerImpl(professorService);
    }
}

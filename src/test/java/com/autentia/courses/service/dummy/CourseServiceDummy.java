package com.autentia.courses.service.dummy;

import com.autentia.courses.model.dto.CourseDTO;
import com.autentia.courses.model.entity.Course;
import com.autentia.courses.model.entity.Professor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

public class CourseServiceDummy {
    public static PageRequest pageRequestDummy(){
        return  PageRequest.of(0, 5, Sort.Direction.DESC, "title");
    }

    public static List<Course> courseListDummy(){
        return Arrays.asList(
                new Course("React",false,  "Intermedio",10,professorDummy()),
                new Course("Introducción a JSF 2",true,  "Intermedio",25,professorDummy()),
                new Course("Clean Code",false,  "Básico",10,professorDummy()),
                new Course("Novedades en Java 8",true,  "Básico",10,professorDummy()),
                new Course("Java para sistemas",true,  "Básico",25,professorDummy()),
                new Course("Angular 2",true,  "Intermedio",25,professorDummy())
        );
    }

    public static List<CourseDTO> courseDTOListDummy(){
        Professor professor = professorDummy();
        return Arrays.asList(
                new CourseDTO(1L,"React","Rubén Aguilera","Intermedio", 10,false),
                new CourseDTO(2L,"Introducción a JSF 2","Roberto Canales","Intermedio",25,true),
                new CourseDTO(3L,"Clean Code","Robert C Martin","Básico",10,false),
                new CourseDTO(4L,"Novedades en Java 8","David Goméz","Básico",10,true),
                new CourseDTO(5L,"Java para sistemas","Alberto Moratilla","Básico",25,true),
                new CourseDTO(6L,"Angular 2","Rubén Aguilera","Intermedio",25, true)
        );
    }

    public static Professor professorDummy(){
        return Professor.builder()
                .id(10L)
                .name("Test name Professor")
                .build();
    }
}

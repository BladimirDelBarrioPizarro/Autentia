package com.autentia.courses.model.map;

import com.autentia.courses.model.constants.ErrorMessages;
import com.autentia.courses.model.dto.CourseDTO;
import com.autentia.courses.model.dto.HttpErrorDTO;
import com.autentia.courses.model.entity.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CourseMapper {
    public static List<CourseDTO> mapListCourseToListCourseDTO(List<Course> courseList) {
        return courseList.stream().map(CourseMapper::mapCourseToCourseDTO).collect(Collectors.toList());
    }

    private static CourseDTO mapCourseToCourseDTO(Course course) {
        return CourseDTO.builder()
                .id(course.getId())
                .title(course.getTitle())
                .active(course.getActive())
                .hours(course.getHours())
                .professor(course.getProfessor().getName())
                .level(course.getLevel())
                .build();
    }


    public static ResponseEntity<HttpErrorDTO> buildHttpErrorDTO(int hashCode, HttpStatus httpStatus, String servletPath, ErrorMessages autentiaErrorPagination, String method, Date date) {
        return new ResponseEntity<>(HttpErrorDTO.builder()
                .code(hashCode)
                .status(httpStatus)
                .date(date)
                .message(autentiaErrorPagination.getMessage())
                .url(servletPath)
                .method(method)
                .build(),HttpStatus.FORBIDDEN);


    }
}

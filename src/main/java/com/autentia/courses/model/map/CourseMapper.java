package com.autentia.courses.model.map;

import com.autentia.courses.model.dto.CourseDTO;
import com.autentia.courses.model.entity.Course;
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
               // .professor(course.getProfessor().getName())
                .level(course.getLevel())
                .build();
    }
}

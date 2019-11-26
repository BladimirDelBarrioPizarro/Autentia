package com.autentia.courses.service;

import com.autentia.courses.model.dto.CourseDTO;
import com.autentia.courses.model.entity.Course;
import com.autentia.courses.model.map.CourseMapper;
import com.autentia.courses.service.dummy.CourseServiceDummy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.PageRequest;

import java.awt.print.Pageable;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class CourseServiceTestImpl {

    private CourseService courseService = Mockito.mock(CourseService.class);

    @Test
    void findAllByActiveAll(){
        PageRequest pageable = CourseServiceDummy.pageRequestDummy();
        List<CourseDTO> courseDTOList = CourseServiceDummy.courseDTOListDummy();
        List<Course> courseList = CourseServiceDummy.courseListDummy();
        given(courseService.findAllByActive(any())).willReturn(courseDTOList);
        List<CourseDTO> courseDTOS = courseService.findAllByActive(pageable);
        List<CourseDTO> courseDTOS1 = CourseMapper.mapListCourseToListCourseDTO(courseList);
        assert (courseDTOS!=null);
        assert (courseDTOS1!=null);
        assert (courseDTOS.get(0).getTitle().equals("React"));
    }

}

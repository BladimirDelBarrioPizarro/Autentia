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

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class CourseServiceTestImpl {
    private CourseService courseService = Mockito.mock(CourseService.class);


    @Test
    void findAllByActiveAll(){
        PageRequest pageable = CourseServiceDummy.pageRequestDummy();
        List<Course> courseList = CourseServiceDummy.courseListDummy();
        List<CourseDTO> courseDTOList = CourseMapper.mapListCourseToListCourseDTO(courseList);
        given(courseService.findAllByActive(any())).willReturn(courseDTOList);
        List<CourseDTO> courseDTOS = courseService.findAllByActive(pageable);
        assert (courseDTOS!=null);
        assert (courseDTOS.get(0).getTitle().equals("React"));
        assert (courseDTOList.size()==6);
    }
}

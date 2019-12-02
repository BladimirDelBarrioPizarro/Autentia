package com.autentia.courses.service;


import com.autentia.courses.model.dto.CourseDTO;
import com.autentia.courses.model.entity.Course;
import com.autentia.courses.model.map.CourseMapper;
import com.autentia.courses.service.dummy.CourseServiceDummy;
import com.autentia.courses.service.impl.CourseServiceImpl;
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
    private CourseServiceImpl courseServiceImpl = Mockito.mock(CourseServiceImpl.class);

    @Test
    void findAllByActiveAll(){
        PageRequest pageable = CourseServiceDummy.pageRequestDummy();
        List<Course> courseList = CourseServiceDummy.courseListDummy();
        List<CourseDTO> courseDTOList = CourseMapper.mapListCourseToListCourseDTO(courseList);
        given(courseService.findAllByActive(any())).willReturn(courseDTOList);
        given(courseServiceImpl.findAllByActive(any())).willReturn(courseDTOList);
        List<CourseDTO> courseDTOS = courseService.findAllByActive(pageable);
        List<CourseDTO> courseDTOS1 = courseServiceImpl.findAllByActive(pageable);
        assert (courseDTOS!=null);
        assert (courseDTOS.get(0).getTitle().equals("React"));
        assert (courseDTOList.size()==6);
        assert (courseDTOS1!=null);
    }

    @Test
    void insertCourseAll(){
        Course course = CourseServiceDummy.courseDummy();
        CourseDTO courseDTO = CourseServiceDummy.courseDTODummy();
        given(courseService.insertCourse(any())).willReturn(courseDTO);
        given(courseServiceImpl.insertCourse(any())).willReturn(courseDTO);
        CourseDTO courseDTO1 = courseService.insertCourse(course);
        CourseDTO courseDTO2 = CourseMapper.mapCourseToCourseDTO(course);
        CourseDTO courseDTO3 = courseServiceImpl.insertCourse(course);
        assert (courseDTO1.getProfessor()==null);
        assert(courseDTO2!=null);
        assert (courseDTO3.getLevel().equals("Intermedio"));
    }
}

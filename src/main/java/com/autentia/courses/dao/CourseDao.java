package com.autentia.courses.dao;

import com.autentia.courses.model.entity.Course;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CourseDao extends PagingAndSortingRepository<Course,Long> {
}

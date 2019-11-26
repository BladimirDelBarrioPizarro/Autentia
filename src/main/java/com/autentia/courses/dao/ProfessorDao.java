package com.autentia.courses.dao;

import com.autentia.courses.model.entity.Professor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProfessorDao extends PagingAndSortingRepository<Professor,Long> {
}

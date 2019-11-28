package com.autentia.courses.dao;

import com.autentia.courses.model.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProfessorDao extends JpaRepository<Professor,Long> {
}

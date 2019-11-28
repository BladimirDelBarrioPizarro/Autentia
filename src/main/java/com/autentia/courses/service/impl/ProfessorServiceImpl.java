package com.autentia.courses.service.impl;

import com.autentia.courses.dao.ProfessorDao;
import com.autentia.courses.model.dto.ProfessorDTO;
import com.autentia.courses.model.map.ProfessorMapper;
import com.autentia.courses.service.ProfessorService;

import java.util.List;

public class ProfessorServiceImpl implements ProfessorService {

    private ProfessorDao professorDao;

    public ProfessorServiceImpl(ProfessorDao professorDao){
        this.professorDao = professorDao;
    }

    @Override
    public List<ProfessorDTO> getProfessors() {
        return ProfessorMapper.mapProfessorsListToProfessorDTOList(professorDao.findAll());
    }
}

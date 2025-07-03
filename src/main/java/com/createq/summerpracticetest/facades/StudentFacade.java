package com.createq.summerpracticetest.facades;

import com.createq.summerpracticetest.dto.StudentDTO;
import com.createq.summerpracticetest.model.StudentModel;

import java.util.List;

public interface StudentFacade {

    public List<StudentDTO> getAll();
}

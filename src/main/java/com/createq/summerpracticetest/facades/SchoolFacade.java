package com.createq.summerpracticetest.facades;

import com.createq.summerpracticetest.dto.SchoolDTO;
import com.createq.summerpracticetest.model.SchoolModel;

import java.util.List;

public interface SchoolFacade {

    public List<SchoolDTO> getAll();
}

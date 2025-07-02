package com.createq.summerpracticetest.service.impl;

import com.createq.summerpracticetest.model.SchoolModel;
import com.createq.summerpracticetest.repository.SchoolRepository;
import com.createq.summerpracticetest.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultSchoolService implements SchoolService {

    private final SchoolRepository schoolRepository;

    @Autowired
    public DefaultSchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public SchoolRepository getSchoolRepository(){
        return schoolRepository;
    }

    public List<SchoolModel> getAll() {
        return schoolRepository.findAll();
    }
}

package com.createq.summerpracticetest.Service;

import com.createq.summerpracticetest.Model.SchoolModel;
import com.createq.summerpracticetest.Repository.DefaultSchoolRepository;
import com.createq.summerpracticetest.Repository.SchoolRepository;

import java.util.List;

public class DefaultSchoolService implements SchoolService {

    private final SchoolRepository schoolRepository;

    public DefaultSchoolService() {
        this.schoolRepository = new DefaultSchoolRepository();
    }

    public SchoolRepository getSchoolRepository(){
        return schoolRepository;
    }

    @Override
    public List<SchoolModel> getAll() {
        return schoolRepository.getAll();
    }
}

package com.createq.summerpracticetest.Service;

import com.createq.summerpracticetest.Model.StudentModel;
import com.createq.summerpracticetest.Repository.DefaultStudentRepository;
import com.createq.summerpracticetest.Repository.StudentRepository;

import java.util.List;

public class DefaultStudentService implements StudentService {

    private final StudentRepository studentRepository;

    public DefaultStudentService() {
        this.studentRepository = new DefaultStudentRepository();
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    @Override
    public List<StudentModel> getAll() {

        return studentRepository.getAll();
    }
}

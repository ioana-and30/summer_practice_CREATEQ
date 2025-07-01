package com.createq.summerpracticetest.service.impl;

import com.createq.summerpracticetest.model.StudentModel;
import com.createq.summerpracticetest.repository.StudentRepository;
import com.createq.summerpracticetest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultStudentService implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public DefaultStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    @Override
    public List<StudentModel> getAll() {

        return studentRepository.getAll();
    }
}

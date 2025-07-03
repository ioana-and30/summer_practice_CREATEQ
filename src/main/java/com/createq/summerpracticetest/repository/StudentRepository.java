package com.createq.summerpracticetest.repository;

import com.createq.summerpracticetest.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {

}

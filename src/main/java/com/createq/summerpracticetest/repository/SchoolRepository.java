package com.createq.summerpracticetest.repository;

import com.createq.summerpracticetest.model.SchoolModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepository extends JpaRepository<SchoolModel, Long> {

}

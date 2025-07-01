package com.createq.summerpracticetest.repository.impl;

import com.createq.summerpracticetest.model.SchoolModel;
import com.createq.summerpracticetest.model.StudentModel;
import com.createq.summerpracticetest.repository.SchoolRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DefaultSchoolRepository implements SchoolRepository {
    @Override
    public List<SchoolModel> getAll() {

        List<SchoolModel> schools = new ArrayList<SchoolModel>();

        SchoolModel school1 = new SchoolModel();
        SchoolModel school2 = new SchoolModel();

        StudentModel student1FromSchool1=new StudentModel();
        student1FromSchool1.setId(11);
        student1FromSchool1.setAge(20);
        student1FromSchool1.setName("Alina");
        student1FromSchool1.setSchool(school1);

        StudentModel student2FromSchool1=new StudentModel();
        student2FromSchool1.setId(12);
        student2FromSchool1.setAge(23);
        student2FromSchool1.setName("Alin");
        student2FromSchool1.setSchool(school1);

        StudentModel student1FromSchool2=new StudentModel();
        student1FromSchool2.setId(21);
        student1FromSchool2.setAge(20);
        student1FromSchool2.setName("Cristi");
        student1FromSchool2.setSchool(school2);

        StudentModel student2FromSchool2=new StudentModel();
        student2FromSchool2.setId(22);
        student2FromSchool2.setAge(20);
        student2FromSchool2.setName("Mariana");
        student2FromSchool2.setSchool(school2);


        List<StudentModel> studentsFromSchool1 = new ArrayList<StudentModel>();
        studentsFromSchool1.add(student1FromSchool1);
        studentsFromSchool1.add(student2FromSchool1);

        List<StudentModel> studentsFromSchool2 = new ArrayList<StudentModel>();
        studentsFromSchool2.add(student1FromSchool2);
        studentsFromSchool2.add(student2FromSchool2);

        schools.add(school1);
        schools.add(school2);

        return schools;
    }
}

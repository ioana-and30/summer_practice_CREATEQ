package com.createq.summerpracticetest.Repository;

import com.createq.summerpracticetest.Model.SchoolModel;
import com.createq.summerpracticetest.Model.StudentModel;

import java.util.ArrayList;
import java.util.List;

public class DefaultStudentRepository implements StudentRepository{

    @Override
    public List<StudentModel> getAll() {

        List<StudentModel> students=new ArrayList<StudentModel>();
        SchoolModel school=new SchoolModel();

        StudentModel student1 = new StudentModel();
        student1.setId(1);
        student1.setAge(21);
        student1.setName("Ioana");
        student1.setSchool(school);

        StudentModel student2= new StudentModel();
        student2.setId(2);
        student2.setAge(22);
        student2.setName("Andreea");
        student2.setSchool(school);

        StudentModel student3 = new StudentModel();
        student3.setId(3);
        student3.setAge(23);
        student3.setName("Mihai");
        student3.setSchool(school);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        return students;
    }
}

package com.createq.summerpracticetest.Model;

import java.util.List;

public class SchoolModel {

    private int id;
    private String name;
    private List<StudentModel> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public List<StudentModel> getStudents() {
        return students;
    }

    public void setStudents(List<StudentModel> students) {
        this.students= students;
    }
}

package com.createq.summerpracticetest.model;

import com.createq.summerpracticetest.dto.StudentDTO;
import jakarta.persistence.*;

import java.util.List;

public class SchoolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String name;

    @OneToMany(mappedBy = "school_id")
    private List<StudentModel> students;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

package com.createq.summerpracticetest.model;

import jakarta.persistence.*;

@Entity
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @ManyToOne
    @JoinColumn(name="school_id")
    private SchoolModel school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SchoolModel getSchool() {
        return school;
    }

    public void setSchool(SchoolModel school) {
        this.school = school;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

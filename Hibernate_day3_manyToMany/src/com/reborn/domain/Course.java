package com.reborn.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Reborn。 on 2017/6/9.
 */
public class Course {
    private Integer id;
    private String name;
    private Set<Student> students = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}

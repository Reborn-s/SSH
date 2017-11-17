package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.reborn.domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reborn。 on 2017/6/4.
 */
public class IteratorAction extends ActionSupport {
    private List<Student> students;

    public String findAll()
    {
        students = new ArrayList<>();
        students.add(new Student("001","张三",20));
        students.add(new Student("002","李四",23));
        students.add(new Student("003","赵六",25));

        return SUCCESS;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

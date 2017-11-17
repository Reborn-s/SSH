package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.reborn.validate.domain.Student;

/**
 * Created by Reborn。 on 2017/6/2.
 */
public class StudentAction extends ActionSupport implements ModelDriven<Student> {
    private Student student = new Student();

    public String addStudent()
    {
        return SUCCESS;
    }

    @Override
    public Student getModel() {
        return student;
    }
}

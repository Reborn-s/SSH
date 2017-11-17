package com.reborn.Test;

import com.reborn.HibernateUtils.HibernateUtils;
import com.reborn.domain.Course;
import com.reborn.domain.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Reborn。 on 2017/6/9.
 */
public class Test {

    @org.junit.Test
    public void fun1()
    {
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();

        Student s1 = new Student();
        s1.setName("hebe");

        Student s2 = new Student();
        s2.setName("selina");

        Course c1 = new Course();
        c1.setName("数学");

        Course c2 = new Course();
        c2.setName("英语");

        Course c3 = new Course();
        c3.setName("物理");

        s1.getCourses().add(c1);
        s1.getCourses().add(c2);
        s1.getCourses().add(c3);

        s2.getCourses().add(c1);
        s2.getCourses().add(c2);
        s2.getCourses().add(c3);

        /*c1.getStudents().add(s1);
        c1.getStudents().add(s2);

        c2.getStudents().add(s1);
        c2.getStudents().add(s2);

        c3.getStudents().add(s1);
        c3.getStudents().add(s2);*/

        session.save(s1);
        session.save(s2);

        transaction.commit();
        session.close();
    }

    @org.junit.Test
    public void fun2()
    {
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();

        List<Student> students = session.createQuery("from Student").list();
        for(Student s:students)
        {
            System.out.println(s.getCourses().size());
        }

        transaction.commit();
        session.close();
    }
}

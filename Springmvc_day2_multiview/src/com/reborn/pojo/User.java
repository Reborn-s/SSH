package com.reborn.pojo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Reborn。 on 2017/8/3.
 */
//@XmlRootElement提供对将对象转化为xml视图的支持，
// 但dispatcher-servlet.xml中如果使用<mvc:annotation-driven/>，javaBean不能添加@XmlRootElement
    //这里有坑！！！见Springmvc_day2_annotation-driven这个里面的注释！！！
@XmlRootElement
public class User
{
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

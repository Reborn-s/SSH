package com.reborn.pojo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Reborn。 on 2017/8/3.
 * 亲测@XmlRootElement和<mvc:annotation-driven/>可以一起使用啊！！！！并没有报错啊！！！
 */
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

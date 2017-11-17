package com.reborn.po;

import java.util.Date;
import java.util.List;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public class OrdersExt extends Orders
{
    private String username;
    private Date birthday;
    private Integer userId;
    private User user;

    private List<Orderdetail> orderdetailList;

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
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

    @Override
    public String toString()
    {
        return "OrdersExt{" +
                "username='" + username + '\'' +
                ", birthday=" + birthday +
                ", userId=" + userId +
                ", user=" + user +
                ", orderdetailList=" + orderdetailList +
                "} " + super.toString();
    }
}

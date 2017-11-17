package com.reborn.pojo;

import java.util.List;
import java.util.Map;

/**
 * Created by Reborn。 on 2017/8/10.
 */
public class UserCustom
{
    private User user;
    private List<User> userList;
    private Map map;

    @Override
    public String toString()
    {
        return "UserCustom{" +
                "user=" + user +
                ", userList=" + userList +
                ", map=" + map +
                '}';
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public List<User> getUserList()
    {
        return userList;
    }

    public void setUserList(List<User> userList)
    {
        this.userList = userList;
    }

    public Map getMap()
    {
        return map;
    }

    public void setMap(Map map)
    {
        this.map = map;
    }
}

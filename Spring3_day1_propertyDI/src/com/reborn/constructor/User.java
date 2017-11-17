package com.reborn.constructor;

/**
 * Created by Reborn。 on 2017/6/13.
 */
public class User {
    private Integer uid;
    private String username;
    private Integer age;

    public User(Integer uid, String username) {
        this.uid = uid;
        this.username = username;
    }

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}

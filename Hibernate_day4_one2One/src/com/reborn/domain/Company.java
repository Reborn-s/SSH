package com.reborn.domain;

/**
 * Created by Reborn。 on 2017/6/10.
 */
public class Company {
    private Integer id;
    private String name;
    private Address addr;

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

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }
}

package com.reborn.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Reborn。 on 2017/6/9.
 */
public class Customer {
    private Integer id;
    private String name;
    private Set<Order> orders = new HashSet<>();

    public Customer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer() {

    }

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

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orders=" + orders +
                '}';
    }
}

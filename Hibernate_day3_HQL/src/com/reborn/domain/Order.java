package com.reborn.domain;

/**
 * Created by Reborn。 on 2017/6/9.
 */
public class Order {
    private Integer id;
    private String name;

    private Customer customer;

    public Order(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Order() {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

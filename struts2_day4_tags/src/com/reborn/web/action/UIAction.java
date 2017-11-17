package com.reborn.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.reborn.domain.Customer;

/**
 * Created by Reborn。 on 2017/6/4.
 */
public class UIAction extends ActionSupport implements ModelDriven<Customer> {
    private Customer customer = new Customer();

    public String show()
    {
        System.out.println(customer);
        return SUCCESS;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public Customer getModel() {
        return customer;
    }
}

package com.reborn.pNamespace;

/**
 * Created by Reborn。 on 2017/6/13.
 */
public class Address {
    private String address;
    private Integer telphone;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTelphone() {
        return telphone;
    }

    public void setTelphone(Integer telphone) {
        this.telphone = telphone;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", telphone=" + telphone +
                '}';
    }
}

package com.reborn.po;

import java.util.Date;
import java.util.List;

/**
 * Created by Reborn。 on 2017/7/23.
 */
public class Orders
{
    private Integer id;
    private Integer user_id;
    private String number;
    private Date createtime;
    private String note;

    private List<Orderdetail> orderdetailList;

    public List<Orderdetail> getOrderdetailList()
    {
        return orderdetailList;
    }

    public void setOrderdetailList(List<Orderdetail> orderdetailList)
    {
        this.orderdetailList = orderdetailList;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getUser_id()
    {
        return user_id;
    }

    public void setUser_id(Integer user_id)
    {
        this.user_id = user_id;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public Date getCreatetime()
    {
        return createtime;
    }

    public void setCreatetime(Date createtime)
    {
        this.createtime = createtime;
    }

    public String getNote()
    {
        return note;
    }

    public void setNote(String note)
    {
        this.note = note;
    }

    @Override
    public String toString()
    {
        return "Orders{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", number='" + number + '\'' +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                '}';
    }
}

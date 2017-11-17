package com.reborn.pojo;

import java.util.Date;

/**
 * Created by Reborn。 on 2017/10/17.
 */
public class Items {
    private Integer id;
    private String name;
    private Float price;
    private String detail;
    private String pic;
    private Date createtime;

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", pic='" + pic + '\'' +
                ", createTime=" + createtime +
                '}';
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createTime) {
        this.createtime = createTime;
    }
}

package com.example.demo.dto;

import com.example.demo.entity.Incoming;

import java.math.BigDecimal;

public class IncomingDto extends Incoming {

    private Integer id;
    private Integer count_Incom;
    private BigDecimal price;


    public IncomingDto() {
    }

    public IncomingDto(Integer id, Integer count_Incom, BigDecimal price) {
        this.id = id;
        this.count_Incom = count_Incom;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getCount_Incom() {
        return count_Incom;
    }

    @Override
    public void setCount_Incom(Integer count_Incom) {
        this.count_Incom = count_Incom;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "IncomingDto{" +
                "id=" + id +
                ", count_Incom=" + count_Incom +
                ", price=" + price +
                '}';
    }
}

package com.example.demo.dto;


import com.example.demo.entity.Incoming;
import com.example.demo.entity.Orders;

import java.util.List;

public class BookDto {
    private Integer id;
    private String title;
    private List<IncomingDto> incomingDto;
    private List<OrdersDto> ordersDto;


    public BookDto() {
    }

    public BookDto(Integer id, String title, List<IncomingDto> incomingDto, List<OrdersDto> ordersDto) {
        this.id = id;
        this.title = title;
        this.incomingDto = incomingDto;
        this.ordersDto = ordersDto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<IncomingDto> getIncomingDto() {
        return incomingDto;
    }

    public void setIncomingDto(List<IncomingDto> incomingDto) {
        this.incomingDto = incomingDto;
    }

    public List<OrdersDto> getOrdersDto() {
        return ordersDto;
    }

    public void setOrdersDto(List<OrdersDto> ordersDto) {
        this.ordersDto = ordersDto;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

package com.example.demo.dto;


import com.example.demo.entity.Book;
import com.example.demo.entity.Orders;

import java.util.List;
import java.util.Objects;
import java.util.Set;


public class CustomerDto {

    private Integer id;
    private String name;
    private String surname;
    private String customer_address;
    private String customer_phone;
    private String customer_email;
    private List<BookDto> booksDto;
    private List<OrdersDto> orderDto;

    public CustomerDto() {
    }

    public CustomerDto(Integer id, String name, String surname, String customer_address,
                       String customer_phone, String customer_email,
                       List<BookDto> booksDto, List<OrdersDto> orderDto) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.customer_address = customer_address;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.booksDto = booksDto;
        this.orderDto = orderDto;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public List<BookDto> getBooksDto() {
        return booksDto;
    }

    public void setBooksDto(List<BookDto> booksDto) {
        this.booksDto = booksDto;
    }

    public List<OrdersDto> getOrderDto() {
        return orderDto;
    }

    public void setOrderDto(List<OrdersDto> orderDto) {
        this.orderDto = orderDto;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", customer_address='" + customer_address + '\'' +
                ", customer_phone='" + customer_phone + '\'' +
                ", customer_email='" + customer_email + '\'' +
                ", booksDto=" + booksDto +
                '}';
    }
}

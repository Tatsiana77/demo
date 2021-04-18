package com.example.demo.dto;

import com.example.demo.entity.Author;
import com.example.demo.entity.Customer;

import java.util.Objects;
import java.util.Set;

public class BookDto {
    private Integer id;
    private String title;
    private Set<Customer> customers;



    public BookDto() {
    }

    public BookDto(Integer id, String title, Set<Customer> customers) {
        this.id = id;
        this.title = title;

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



    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

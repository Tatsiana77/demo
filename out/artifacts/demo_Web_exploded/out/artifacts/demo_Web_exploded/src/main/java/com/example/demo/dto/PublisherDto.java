package com.example.demo.dto;

import com.example.demo.entity.Publisher;

import java.time.Year;
import java.util.List;

public class PublisherDto extends Publisher {

    private Integer id;
    private String name;
    private String publisher_Address;
    private Year yearOfPub;
    private List<BookDto> bookDto;

    public PublisherDto() {
    }

    public PublisherDto(Integer id, String name, String publisher_Address, Year yearOfPub, List<BookDto> bookDto) {
        this.id = id;
        this.name = name;
        this.publisher_Address = publisher_Address;
        this.yearOfPub = yearOfPub;
        this.bookDto = bookDto;
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPublisher_Address() {
        return publisher_Address;
    }

    @Override
    public void setPublisher_Address(String publisher_Address) {
        this.publisher_Address = publisher_Address;
    }

    @Override
    public Year getYearOfPub() {
        return yearOfPub;
    }

    @Override
    public void setYearOfPub(Year yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public List<BookDto> getBookDto() {
        return bookDto;
    }

    public void setBookDto(List<BookDto> bookDto) {
        this.bookDto = bookDto;
    }

    @Override
    public String toString() {
        return "PublisherDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisher_Address='" + publisher_Address + '\'' +
                ", yearOfPub=" + yearOfPub +
                ", bookDto=" + bookDto +
                '}';
    }
}



package com.example.demo.dto;

import com.example.demo.entity.Book;

import java.util.List;

public class AuthorDto {

    private Integer id;
    private String name;
    private String surname;
    private List<BookDto> bookDto;

    public AuthorDto() {
    }

    public AuthorDto(Integer id, String name, String surname, List<BookDto> bookDto) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.bookDto = bookDto;
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

    public List<BookDto> getBookDto() {
        return bookDto;
    }

    public void setBookDto(List<BookDto> bookDto) {
        this.bookDto = bookDto;
    }

    @Override
    public String toString() {
        return "AuthorDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bookDto=" + bookDto +
                '}';
    }
}

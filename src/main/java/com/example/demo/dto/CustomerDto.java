package com.example.demo.dto;

import com.example.demo.entity.Book;

import java.util.Objects;
import java.util.Set;

public class CustomerDto {

    private Integer id;
    private String name;
    private String surname;
    private String customer_address;
    private String customer_phone;
    private String customer_email;
    private Set<BookDto> bookDto;

    public CustomerDto() {
    }

    public CustomerDto(Integer id, String name, String surname, String customer_address,
                       String customer_phone, String customer_email, Set<BookDto> bookDto) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.customer_address = customer_address;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
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

    public Set<BookDto> getBookDto() {
        return bookDto;
    }

    public void setBookDto(Set<BookDto> bookDto) {
        this.bookDto = bookDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerDto)) return false;
        CustomerDto that = (CustomerDto) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getSurname(), that.getSurname()) && Objects.equals(getCustomer_address(), that.getCustomer_address()) && Objects.equals(getCustomer_phone(), that.getCustomer_phone()) && Objects.equals(getCustomer_email(), that.getCustomer_email()) && Objects.equals(getBookDto(), that.getBookDto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getCustomer_address(), getCustomer_phone(), getCustomer_email(), getBookDto());
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
                ", bookDto=" + bookDto +
                '}';
    }
}

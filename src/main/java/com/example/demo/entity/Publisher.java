package com.example.demo.entity;

import javax.persistence.*;
import java.time.Year;
import java.util.List;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="name")
    private String name;

    @Column(name= "publisher_Address")
    private String publisher_Address;

    @Column(name="yearOfPub ")
    private Year yearOfPub;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "publisher", cascade = CascadeType.ALL)
    private  List<Book> book;


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

    public String getPublisher_Address() {
        return publisher_Address;
    }

    public void setPublisher_Address(String publisher_Address) {
        this.publisher_Address = publisher_Address;
    }

    public Year getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(Year yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publisher_Address='" + publisher_Address + '\'' +
                ", yearOfPub=" + yearOfPub +
                ", book=" + book +
                '}';
    }
}

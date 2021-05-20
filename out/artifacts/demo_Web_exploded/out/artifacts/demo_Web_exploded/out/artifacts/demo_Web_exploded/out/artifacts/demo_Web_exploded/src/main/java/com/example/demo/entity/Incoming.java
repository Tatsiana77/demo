package com.example.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Incoming {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name=" count_Incom")
    private Integer  count_Incom;

    @Column(name="price")
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "suppliers_id", nullable = false)
    private Suppliers suppliers;

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount_Incom() {
        return count_Incom;
    }

    public void setCount_Incom(Integer count_Incom) {
        this.count_Incom = count_Incom;
    }



    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Incoming{" +
                "id=" + id +
                ", count_Incom=" + count_Incom +
                ", price=" + price +
                ", book=" + book +
                ", suppliers=" + suppliers +
                '}';
    }


}

package com.example.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name=" suppliers_Name")
    private String  suppliers_Name;

    @Column(name="suppliers_Phone")
    private String suppliers_Phone;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "suppliers", cascade = CascadeType.ALL)
    private List<Incoming> incoming;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuppliers_Name() {
        return suppliers_Name;
    }

    public void setSuppliers_Name(String suppliers_Name) {
        this.suppliers_Name = suppliers_Name;
    }

    public String getSuppliers_Phone() {
        return suppliers_Phone;
    }

    public void setSuppliers_Phone(String suppliers_Phone) {
        this.suppliers_Phone = suppliers_Phone;
    }

    public List<Incoming> getIncoming() {
        return incoming;
    }

    public void setIncoming(List<Incoming> incoming) {
        this.incoming = incoming;
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                "id=" + id +
                ", suppliers_Name='" + suppliers_Name + '\'' +
                ", suppliers_Phone='" + suppliers_Phone + '\'' +
                ", incoming=" + incoming +
                '}';
    }
}

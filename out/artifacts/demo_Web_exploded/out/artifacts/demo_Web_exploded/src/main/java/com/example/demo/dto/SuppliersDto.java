package com.example.demo.dto;

import com.example.demo.entity.Incoming;
import com.example.demo.entity.Suppliers;

import java.util.List;

public class SuppliersDto  extends Suppliers {
    private Integer id;
    private String  suppliers_Name;
    private String suppliers_Phone;
    private List<Incoming> incoming;

    public SuppliersDto() {
    }

    public SuppliersDto(Integer id, String suppliers_Name, String suppliers_Phone, List<Incoming> incoming) {
        this.id = id;
        this.suppliers_Name = suppliers_Name;
        this.suppliers_Phone = suppliers_Phone;
        this.incoming = incoming;
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
    public String getSuppliers_Name() {
        return suppliers_Name;
    }

    @Override
    public void setSuppliers_Name(String suppliers_Name) {
        this.suppliers_Name = suppliers_Name;
    }

    @Override
    public String getSuppliers_Phone() {
        return suppliers_Phone;
    }

    @Override
    public void setSuppliers_Phone(String suppliers_Phone) {
        this.suppliers_Phone = suppliers_Phone;
    }

    @Override
    public List<Incoming> getIncoming() {
        return incoming;
    }

    @Override
    public void setIncoming(List<Incoming> incoming) {
        this.incoming = incoming;
    }

    @Override
    public String toString() {
        return "SuppliersDto{" +
                "id=" + id +
                ", suppliers_Name='" + suppliers_Name + '\'' +
                ", suppliers_Phone='" + suppliers_Phone + '\'' +
                ", incoming=" + incoming +
                '}';
    }
}

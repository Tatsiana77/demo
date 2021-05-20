package com.example.demo.repository;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT  DISTINCT c FROM Customer c")
    public List<Customer> getAllCustomer();

    @Modifying
    @Query("SELECT  c FROM Customer c   JOIN FETCH c.books  WHERE  c.id = :id ")
    public Customer getCustomerWithBookById(@Param("id") Integer id);


    @Query("SELECT  distinct  c FROM Customer c  Left   JOIN FETCH c.books ")
    public List<Customer> getCustomerWithBook();


}

package com.example.demo.repository;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT c FROM Customer c")
    public List<Customer> getAllCustomer();

    @Query("SELECT  c FROM Customer c LEFT JOIN FETCH c.book  WHERE  c.id = :id ")
    public Customer getCustomerWithBookById(@Param("id") Integer id);


    @Query("SELECT  c FROM Customer c LEFT JOIN FETCH c.book")
    public List<Customer> getCustomerWithBook();
}

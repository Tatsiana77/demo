package com.example.demo.repository;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Set;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT  DISTINCT c FROM Customer c")
    public Set<Customer> getAllCustomer();

    @Query("SELECT  c FROM Customer c   JOIN FETCH c.book  WHERE  c.id = :id ")
    public Customer getCustomerWithBookById(@Param("id") Integer id);


    @Query("SELECT  distinct  c FROM Customer c  left   JOIN FETCH c.book")
    public Set<Customer> getCustomerWithBook();



}

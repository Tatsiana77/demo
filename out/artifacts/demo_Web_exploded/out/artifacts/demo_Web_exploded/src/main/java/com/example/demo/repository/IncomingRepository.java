package com.example.demo.repository;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Incoming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IncomingRepository extends JpaRepository<Incoming, Integer> {

    @Query("SELECT  DISTINCT c FROM Customer c")
    public List<Incoming> getAllIncoming();
}

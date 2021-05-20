package com.example.demo.repository;

import com.example.demo.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

    @Query("SELECT  p FROM Publisher p")
    public List<Publisher>  getAllPublisher();


    @Query("SELECT p FROM Publisher p LEFT JOIN FETCH p.book WHERE  p.id = :id ")
    public Publisher getPublisherWithBookById(@Param("id") Integer id);
}

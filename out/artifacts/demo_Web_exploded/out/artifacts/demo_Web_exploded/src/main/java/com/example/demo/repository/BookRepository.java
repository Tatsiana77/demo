package com.example.demo.repository;

import com.example.demo.entity.Book;
import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {


    @Query("SELECT b FROM Book b ")
    public List<Book> getAllBook();


    @Query("SELECT DISTINCT b FROM Book b  WHERE b.title = :name")
    public Book getBookByName(@Param("name") String name);


    @Query("SELECT   b FROM Book b  JOIN FETCH b.customer  WHERE  b.id = :id ")
    public Book getBookById(@Param("id") Integer id);

    @Query("SELECT b FROM Book b  LEFT JOIN FETCH b.incoming WHERE  b.id = :id")
    public Book getBookWithIncomingById(@Param("id") Integer id);

    @Query("SELECT  b FROM Book  b  LEFT JOIN FETCH b.orders WHERE b.id =:id")
    public Book getBookWithOrdersById(@Param("id") Integer id);

    @Query("SELECT  DISTINCT b FROM Book  b LEFT JOIN FETCH b.customer  ")
    public  List<Book> getAllBookWithJoin();

    @Query("SELECT  b FROM Book b  LEFT JOIN FETCH b.incoming ")
    public List<Book>  getBookWithIncoming();

    @Query("SELECT  b FROM Book  b LEFT JOIN FETCH b.orders")
    public List<Book> getBookWithOrders();











}

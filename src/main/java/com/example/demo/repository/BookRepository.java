package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {


    @Query("SELECT b FROM Book b ")
    public List<Book> getAllBook();


    @Query("SELECT DISTINCT b FROM Book b  WHERE b.title = :name")
    public Book getBookByName(@Param("name") String name);


    @Query("SELECT DISTINCT b FROM Book  b LEFT JOIN FETCH b.author")
    public List<Book> getAllBookWithAuthor();

    @Query("SELECT DISTINCT b FROM Book b LEFT JOIN FETCH b.customers")
    public List<Book> getAllBookWithJoin();
}

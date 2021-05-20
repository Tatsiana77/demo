package com.example.demo.service;

import com.example.demo.dto.BookDto;
import com.example.demo.entity.Book;

import java.util.List;

public interface BookService {

    public List<BookDto> getAllBook();

    public List<BookDto> getAllBookWithJoin();

    public BookDto  getBookById(Integer idBook);

    public void saveBook(BookDto bookDto);

    public void deleteBookById(Integer id);



}
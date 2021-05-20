package com.example.demo.service;

import com.example.demo.dto.BookDto;
import com.example.demo.entity.Book;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookService {

    public List<BookDto> getAllBook();


    public BookDto getBookById(Integer idBook);

    public void saveBook(BookDto bookDto);

    public void deleteBookById(Integer id);

    public BookDto getBookWithIncomingById(Integer idBook);

    public BookDto getBookWithOrdersById(@Param("id") Integer idBook);

    public  List<BookDto> getAllBookWithJoin();

    public List<BookDto>  getBookWithIncoming();
}

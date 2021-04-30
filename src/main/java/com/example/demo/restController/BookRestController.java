package com.example.demo.restController;

import com.example.demo.dto.BookDto;
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookRestController {
    private BookService bookService;

    @Autowired
    public BookRestController(BookService bookService) { this.bookService = bookService; }

    @GetMapping("/api/book")
    public List<BookDto> getAllBook() {
        return bookService.getAllBook();
    }

    @GetMapping("/api/bookWithJoin")
    public List<BookDto> getAllBookWithJoin(){
        return bookService.getAllBookWithJoin();
    }

}

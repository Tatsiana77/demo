package com.example.demo.controller;

import com.example.demo.dto.BookDto;
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String AllBook(ModelMap modelMap) {
        List<BookDto> books = bookService.getAllBook();
        modelMap.addAttribute("books", books);
        return "book";
    }

//    @RequestMapping(value = "book/customer", method = RequestMethod.GET)
//    public String getAllBookWithCustomer(ModelMap modelMap, @RequestParam Integer id) {
//        BookDto bookDto = bookService.getBookById(id);
//        modelMap.addAttribute("book", bookDto);
//        return "book_customer";
//    }

    @RequestMapping(value = "/newBook ", method = RequestMethod.POST)
    public String newBookForm(ModelMap modelMap) {
        Book book = new Book();
        modelMap.addAttribute("book", book);
        return "new_book";

    }
}

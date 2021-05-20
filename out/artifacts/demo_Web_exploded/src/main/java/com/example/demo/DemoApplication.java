package com.example.demo;

import com.example.demo.dto.AuthorDto;
import com.example.demo.dto.BookDto;
import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Author;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.service.AuthorService;
import com.example.demo.service.BookService;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoApplication  implements  CommandLineRunner {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private  AuthorService authorService;

    @Autowired
    private  BookService bookService;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    List<CustomerDto> customerDtos = customerService.getCustomerWithBook();
        for (CustomerDto customer: customerDtos ) {
            System.out.println(customer);
        }

        System.out.println("-------------------------------------------------------------------------------------");


        List<AuthorDto> authorDtos = authorService.getAllAuthorWithBooks();
        for (AuthorDto author : authorDtos) {
            System.out.println(author);
        }

        System.out.println("-------------------------------------------------------------------------------------");

        List<BookDto> bookDtos = bookService.getAllBookWithJoin();
        for(BookDto  book : bookDtos){
            System.out.println(book);
        }



    }
}

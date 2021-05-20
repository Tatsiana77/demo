package com.example.demo.service;

import com.example.demo.dto.BookDto;
import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Book;
import com.example.demo.entity.Customer;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookDto> getAllBook() {
        List<Book> books = bookRepository.getAllBook();
        return convertListToListBookDto(books);
    }


    @Override
    public List<BookDto> getAllBookWithJoin() {
        List<Book> books = bookRepository.getAllBookWithJoin();
        return convertListToListBookDto(books);
    }

    @Override
    public BookDto getBookById(Integer idBook) {
        Book book = bookRepository.findById(idBook).get();
        return  convertFromEntityToDto(book);
    }

    @Override
    public void saveBook(BookDto bookDto) {
        Book book = convertFromDtoToEntity(bookDto);
        bookRepository.save(book);
    }


    @Override
    public void deleteBookById(Integer id) {
        bookRepository.deleteById(id);
    }


    private List<BookDto> convertListToListBookDto(List<Book> book) {
        List<BookDto> bookDtos = new ArrayList<>();
        for (Book books : book) {
            bookDtos.add(convertFromEntityToDto(books));
        }


        return bookDtos;
    }

    private BookDto convertFromEntityToDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());

        return bookDto;


    }

    private Book convertFromDtoToEntity(BookDto bookDto) {
        Book book = new Book();
        if (bookDto.getId() != null) {
            book.setId(bookDto.getId());
        }
        book.setTitle(bookDto.getTitle());
        return book;
    }

}



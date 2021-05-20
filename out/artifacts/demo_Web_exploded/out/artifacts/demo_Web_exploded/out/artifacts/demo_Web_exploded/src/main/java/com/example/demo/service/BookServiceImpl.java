package com.example.demo.service;

import com.example.demo.dto.*;
import com.example.demo.entity.*;
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
    public BookDto getBookById(Integer idBook) {
        return convertFromEntityToDto(bookRepository.getBookById(idBook));
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

    @Override
    public BookDto getBookWithIncomingById(Integer idBook) {
        return convertFromEntityWithIncomingToDto(bookRepository.getBookWithIncomingById(idBook));
    }

    @Override
    public BookDto getBookWithOrdersById(Integer idBook) {
        return convertFromEntityWithOrdersToDto(bookRepository.getBookWithOrdersById(idBook));
    }

    @Override
    public List<BookDto> getAllBookWithJoin() {
        List<Book> books = bookRepository.getAllBookWithJoin();
        return convertListToListBookDto(books);
    }

    @Override
    public List<BookDto> getBookWithIncoming() {
        List<Book> books = bookRepository.getBookWithIncoming();
         return convertListBookWithIncomingToDto(books);
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

    private BookDto convertFromEntityWithIncomingToDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());

        List<IncomingDto> incomingDtos = new ArrayList<>();
        for (Incoming incoming : book.getIncoming()) {
            IncomingDto incomingDto = new IncomingDto();
            incomingDto.setId(incoming.getId());
            incomingDto.setCount_Incom(incoming.getCount_Incom());
            incomingDto.setPrice(incoming.getPrice());
            incomingDtos.add(incomingDto);
        }
        bookDto.setIncomingDto(incomingDtos);
        return bookDto;
    }

    private BookDto convertFromEntityWithOrdersToDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());

        List<OrdersDto> ordersDtos = new ArrayList<>();
        for (Orders orders : book.getOrders()) {
            OrdersDto ordersDto = new OrdersDto();
            ordersDto.setId(orders.getId());
            ordersDto.setCountOrders(orders.getCountOrders());
            ordersDto.setDateOfOrder(orders.getDateOfOrder());
            ordersDtos.add(ordersDto);
        }
        bookDto.setOrdersDto(ordersDtos);
        return bookDto;
    }

    private   List<BookDto> convertListBookWithIncomingToDto(List<Book> book){
        List<BookDto> bookDtos = new ArrayList<>();
        for (Book books : book) {
            bookDtos.add(convertFromEntityWithIncomingToDto(books));
        }
        return bookDtos;
    }


}



package com.example.demo.service;


import com.example.demo.dto.BookDto;
import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Book;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDto getCustomerWithById(Integer idCustomer) {
        return convertFromEntityToDto(customerRepository.getCustomerWithBookById(idCustomer));
    }

    @Override
    @Transactional
    public List<CustomerDto> getCustomerWithBook() {
        List<Customer> customer = customerRepository.getCustomerWithBook();
        return convertFromListEntityToListDto(customer);
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        List<Customer> customer = customerRepository.getAllCustomer();
        return convertListCustomerToListDto(customer);
    }

    @Override
    public void saveEntity(CustomerDto customerDto) {
        Customer customer = convertFromCustomerDtoToEntity(customerDto);
        customerRepository.save(customer);
    }

    @Override
    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }


    private List<CustomerDto> convertFromListEntityToListDto(List<Customer> customer) {
        List<CustomerDto> customerDtos = new ArrayList<>();
        for (Customer customers : customer) {
            customerDtos.add(convertFromEntityToDto(customers));
        }

        return customerDtos;
    }

    private CustomerDto convertFromEntityToDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setSurname(customer.getSurname());
        customerDto.setCustomer_address(customer.getCustomer_address());
        customerDto.setCustomer_email(customer.getCustomer_email());
        customerDto.setCustomer_phone(customer.getCustomer_phone());

        List<BookDto> bookDtos = new ArrayList<>();
        for (Book book : customer.getBooks()) {
            BookDto bookDto = new BookDto();
            bookDto.setId(book.getId());
            bookDto.setTitle(book.getTitle());
            bookDtos.add(bookDto);
        }
        customerDto.setBooksDto(bookDtos);
        return customerDto;
    }

    private List<CustomerDto> convertListCustomerToListDto(List<Customer> customer) {
        List<CustomerDto> customerDtos = new ArrayList<>();
        for (Customer customers : customer) {
            customerDtos.add(convertFromEntityCustomerToDto(customers));
        }

        return customerDtos;
    }

    private CustomerDto convertFromEntityCustomerToDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setSurname(customer.getSurname());
        customerDto.setCustomer_address(customer.getCustomer_address());
        customerDto.setCustomer_phone(customer.getCustomer_phone());
        customerDto.setCustomer_email(customer.getCustomer_email());
        customerDto.setBooksDto(new ArrayList<>());
        return customerDto;
    }

    private Customer convertFromCustomerDtoToEntity(CustomerDto customerDto) {
        Customer customer = new Customer();
        if (customerDto.getId() != null) {
            customer.setId(customerDto.getId());
        }
        customer.setName(customerDto.getName());
        customer.setSurname(customerDto.getSurname());
        customer.setCustomer_email(customerDto.getCustomer_email());
        customer.setCustomer_address(customerDto.getCustomer_address());
        customer.setCustomer_phone(customerDto.getCustomer_phone());
        List<Book> book = new ArrayList<>();
        for (BookDto bookdto : customerDto.getBooksDto()) {
            book.add(convertFromBookDtoToBookEntity(bookdto));
        }
        customer.setBooks(book);
        return customer;
    }

    private Book convertFromBookDtoToBookEntity(BookDto bookDto) {
        Book book = new Book();
        if (bookDto.getId() != null) {
            book.setId(bookDto.getId());
        }
        book.setTitle(bookDto.getTitle());
        return book;
    }


}

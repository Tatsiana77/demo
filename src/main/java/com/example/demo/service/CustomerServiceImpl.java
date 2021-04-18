package com.example.demo.service;


import com.example.demo.dto.BookDto;
import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Book;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDto getCustomerWithBookById() {
        return null;
    }

    @Override
    public List<CustomerDto> getCustomerWithBook() {
        List<Customer> customer = customerRepository.getCustomerWithBook();
        return convertFromListEntityToListDto(customer);
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        List<Customer> customer = customerRepository.getAllCustomer();
        return convertListCustomerToListDto (customer);
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

        Set<BookDto> bookDtos = new HashSet<>();

        for (Book book : customer.getBook()) {
            BookDto bookDto = new BookDto();
            bookDto.setId(book.getId());
            bookDto.setTitle(book.getTitle());
            bookDtos.add(bookDto);

        }
        customerDto.setBookDto(bookDtos);
        return customerDto;
    }

    private List<CustomerDto> convertListCustomerToListDto(List<Customer> customer) {
        List<CustomerDto> customerDtos = new ArrayList<>();
        for (Customer customers : customer) {
            customerDtos.add(convertFromEntityAuthorToDto(customers));
        }

        return customerDtos;
    }

    private CustomerDto convertFromEntityAuthorToDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setSurname(customer.getSurname());
        customerDto.setCustomer_address(customer.getCustomer_address());
        customerDto.setCustomer_phone(customer.getCustomer_phone());
        customerDto.setCustomer_email(customer.getCustomer_email());
        customerDto.setBookDto(new HashSet<>());
        return customerDto;
    }


}

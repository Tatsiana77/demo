package com.example.demo.service;


import com.example.demo.dto.BookDto;
import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Book;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDto getCustomerWithById(Integer idCustomer) {
        Customer customer = customerRepository.findById(idCustomer).get();
        return convertFromEntityAuthorToDto(customer);
    }

    @Override
    @Transactional
    public Set<CustomerDto> getCustomerWithBook() {
        Set<Customer> customer = customerRepository.getCustomerWithBook();
        return convertFromListEntityToListDto(customer);
    }

    @Override
    public Set<CustomerDto> getAllCustomer() {
        Set<Customer> customer = customerRepository.getAllCustomer();
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


    private Set<CustomerDto> convertFromListEntityToListDto(Set<Customer> customer) {
        Set<CustomerDto> customerDtos = new HashSet<>();
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

    private Set<CustomerDto> convertListCustomerToListDto(Set<Customer> customer) {
        Set<CustomerDto> customerDtos = new HashSet<>();
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
        Set<Book> book = new HashSet<>();
        for (BookDto bookdto : customerDto.getBookDto()) {
            book.add(convertFromBookDtoToBookEntity(bookdto));
        }
        customer.setBook(book);
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

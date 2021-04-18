package com.example.demo.service;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;

import java.util.List;


public interface CustomerService {

    public CustomerDto getCustomerWithBookById();

    public List<CustomerDto> getCustomerWithBook();

    public List<CustomerDto> getAllCustomer();

}

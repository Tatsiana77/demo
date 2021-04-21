package com.example.demo.service;

import com.example.demo.dto.AuthorDto;
import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;

import java.util.List;
import java.util.Set;


public interface CustomerService {

    public CustomerDto getCustomerWithById(Integer idCustomer);

    public Set<CustomerDto> getCustomerWithBook();

    public Set<CustomerDto> getAllCustomer();

    public void saveEntity(CustomerDto customerDto);

    public void deleteById(Integer id);

}

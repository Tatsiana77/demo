package com.example.demo.service;

import com.example.demo.dto.AuthorDto;
import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;


public interface CustomerService {

    public CustomerDto getCustomerWithById(Integer idCustomer);

    public List<CustomerDto> getCustomerWithBook();

    public List<CustomerDto> getAllCustomer();

    public void saveEntity(CustomerDto customerDto);

    public void deleteById(Integer id);

    public CustomerDto getCustomerWithOrdersById( Integer idCustomer);

    public List<CustomerDto> getCustomerWithOrders();

}

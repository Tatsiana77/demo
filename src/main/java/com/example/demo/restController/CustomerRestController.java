package com.example.demo.restController;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class CustomerRestController {
    private CustomerService customerService;

    @Autowired
    public CustomerRestController(CustomerService customerService) { this.customerService = customerService; }

    @GetMapping("/customer")
    public Set<CustomerDto>  getAllCustomer() {
        return customerService.getAllCustomer();
    }
}

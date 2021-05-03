package com.example.demo.restController;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class CustomerRestController {
    private CustomerService customerService;

    @Autowired
    public CustomerRestController(CustomerService customerService) { this.customerService = customerService; }

    @GetMapping("/api/customers")
    public List<CustomerDto> getAllCustomer() {
        return customerService.getAllCustomer();
    }


    @GetMapping("/api/customerWithBook")
    public List<CustomerDto> getCustomerWithBook(){
        return  customerService.getCustomerWithBook();
    }



}

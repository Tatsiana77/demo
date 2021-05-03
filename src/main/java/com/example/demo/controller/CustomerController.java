package com.example.demo.controller;

import com.example.demo.dto.CustomerDto;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String  AllCustomer(ModelMap modelmap) {
        List<CustomerDto> customers = customerService.getAllCustomer();
        modelmap.addAttribute("customers", customers);
        return "customer";
    }


    @RequestMapping("edit-customer")
    public String  saveCustomer(@ModelAttribute("customer" ) CustomerDto customerDto){
        customerService.saveEntity(customerDto);
        return "redirect:/customer";
    }
}

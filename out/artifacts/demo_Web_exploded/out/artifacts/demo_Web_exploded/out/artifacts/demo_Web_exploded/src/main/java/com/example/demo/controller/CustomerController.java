package com.example.demo.controller;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;
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
    public String AllCustomer(ModelMap modelmap) {
        List<CustomerDto> customers = customerService.getCustomerWithBook();
        modelmap.addAttribute("customers", customers);
        return "customer";
    }

    @RequestMapping(value = "/newCustomer ")
    public String newCustomerForm(ModelMap modelMap) {
        Customer customer = new Customer();
        modelMap.addAttribute("new_customer", customer);
        return "new_customer";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("customer") CustomerDto customerDto) {
        customerService.saveEntity(customerDto);
        return "redirect:/ customer";
    }

    @RequestMapping(value = "/customer/book", method = RequestMethod.GET)
    public String getAllCustomer(ModelMap modelMap, @RequestParam Integer id) {
        CustomerDto customerDto = customerService.getCustomerWithById(id);
        modelMap.addAttribute("customer", customerDto);
        return "customer_book";
    }

    @RequestMapping(value = "/customer/orders", method = RequestMethod.GET)
    public String getAllCustomerWithOrders(ModelMap modelMap, @RequestParam Integer id) {
        CustomerDto customerDto = customerService.getCustomerWithOrdersById(id);
        modelMap.addAttribute("customer", customerDto);
        return "customer_order";
    }

}

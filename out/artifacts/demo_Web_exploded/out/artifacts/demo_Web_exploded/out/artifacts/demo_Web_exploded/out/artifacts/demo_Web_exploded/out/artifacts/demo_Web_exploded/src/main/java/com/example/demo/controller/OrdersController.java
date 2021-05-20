package com.example.demo.controller;

import com.example.demo.dto.BookDto;
import com.example.demo.dto.OrdersDto;
import com.example.demo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OrdersController {

    private OrdersService ordersService;
@Autowired
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String getAllOrders(ModelMap modelMap){
    List<OrdersDto> ordersDto = ordersService.getAllOrders();
    modelMap.addAttribute("orders", ordersDto);
    return "orders";
    }


}

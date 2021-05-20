package com.example.demo.service;

import com.example.demo.dto.OrdersDto;
import com.example.demo.entity.Orders;

import java.util.List;

public interface OrdersService {
    public List<OrdersDto> getAllOrders();
}

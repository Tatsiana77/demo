package com.example.demo.service;

import com.example.demo.dto.AuthorDto;
import com.example.demo.dto.OrdersDto;
import com.example.demo.entity.Author;
import com.example.demo.entity.Orders;
import com.example.demo.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrdersServiceImpl implements OrdersService {
    private OrdersRepository ordersRepository;

    @Autowired
    public OrdersServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public List<OrdersDto> getAllOrders() {
        List<Orders> orders = ordersRepository.getAllOrders();
        return convertListAuthorToListAuthorDto(orders);
    }

    private List<OrdersDto> convertListAuthorToListAuthorDto(List<Orders> orders) {
        List<OrdersDto> ordersDtos = new ArrayList<>();
        for (Orders order : orders) {
            ordersDtos.add(convertFromEntityAuthorToDto(order));
        }

        return ordersDtos;
    }

    private OrdersDto convertFromEntityAuthorToDto(Orders orders) {
        OrdersDto ordersDto = new OrdersDto();
        ordersDto.setId(orders.getId());
        ordersDto.setCountOrders(orders.getCountOrders());
        ordersDto.setDateOfOrder(orders.getDateOfOrder());
        return ordersDto;
    }

}

package com.example.practice.Service;

import java.util.List;

import com.example.practice.Entity.Orders;

public interface OrdersService {
    Orders createOrder(Orders order);

    List<Orders> getAllOrders();

    Orders getOrderById(long id);

    // Order updateOrderById(long id, Order order);

    // String deleteOrderById(long id);
}

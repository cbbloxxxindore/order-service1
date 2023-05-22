package com.vanguard.orederservice.service;

import com.vanguard.orederservice.models.Order;
import com.vanguard.orederservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl  implements OrderService{

private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
@Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}

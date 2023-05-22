package com.vanguard.orederservice.service;

import com.vanguard.orederservice.models.Order;

public interface OrderService {
    Order saveOrder(Order order);
}

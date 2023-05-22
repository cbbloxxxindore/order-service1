package com.vanguard.orederservice.resource;

import com.vanguard.orederservice.models.Order;
import com.vanguard.orederservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderResource {
private OrderService orderService;

    public OrderResource(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/orders")
    public ResponseEntity<Order> createOrder( @RequestBody Order order )
    {
        Order order1=orderService.saveOrder(order    );
        return  ResponseEntity.ok(order1);
    }
}

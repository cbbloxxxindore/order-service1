package com.vanguard.orederservice.resource;

import com.vanguard.orederservice.models.Order;
import com.vanguard.orederservice.service.OrderService;
import jakarta.ws.rs.POST;
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

        return  ResponseEntity.ok(order);
    }
}

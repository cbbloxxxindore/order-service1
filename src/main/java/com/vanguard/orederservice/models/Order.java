package com.vanguard.orederservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ProductOrderTbl")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  OrderId;
    private double orderAmount;
    private int productId;
}

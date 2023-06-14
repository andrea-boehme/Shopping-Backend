package com.example.shoppingbackend.entity;

public class OrderItem {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@ManyToOne
    private Product product;

    private Integer quantity;
    private Number price;

    // getters and setters
}

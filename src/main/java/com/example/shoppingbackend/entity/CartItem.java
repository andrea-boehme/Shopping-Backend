package com.example.shoppingbackend.entity;

public class CartItem {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Number id;

    //@ManyToOne
    private Product product;

    private Number quantity;

    // getters and setters
}

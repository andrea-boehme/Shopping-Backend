package com.example.shoppingbackend.entity;

public class Cart {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Number id;

    //@OneToMany(mappedBy = "cart")
    private List<CartItem> items;

    //@OneToOne
    private User user;

    // getters and setters
}

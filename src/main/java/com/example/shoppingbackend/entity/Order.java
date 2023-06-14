package com.example.shoppingbackend.entity;

import java.util.Date;

public class Order {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@OneToMany(mappedBy = "order")
    private List<OrderItem> items;

    //@ManyToOne
    private User user;

    private Enum status;
    private Number total;
    private Date dateCreated;

    // getters and setters
}

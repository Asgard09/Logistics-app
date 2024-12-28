package com.example.logistics.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "driver_id")
    private String pickup_address;

    @Column(name = "delivery_address")
    private String delivery_address;

    @Column(name = "package_details")
    private String package_details;

    @Column(name = "pickup_time")
    private Date delivery_time;

    @Column(name = "delivery_time")
    private String status;
}

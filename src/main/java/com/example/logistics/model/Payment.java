package com.example.logistics.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_id")
    private int order_id;

    @Column(name = "amount")
    private float amount;

    @Column(name = "payment_method")
    private String payment_method;

    @Column(name = "status")
    private String status;

    @Column(name = "transaction_date")
    private Date transaction_date;

}

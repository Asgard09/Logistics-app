package com.example.logistics.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_id")
    private int order_id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "status")
    private String status;

    @Column(name = "message")
    private String message;

    @Column(name = "created_at")
    private Date created_at;
}

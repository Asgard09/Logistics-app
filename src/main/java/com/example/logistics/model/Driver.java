package com.example.logistics.model;

import jakarta.persistence.*;

@Entity
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "vehicle_license_plate")
    private String vehicle_license_plate;

    @Column(name = "vehicle_type")
    private String vehicle_type;

    @Column(name = "vehicle_capacity")
    private int vehicle_capacity;

}

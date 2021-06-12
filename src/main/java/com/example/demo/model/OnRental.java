package com.example.demo.model;/*
@USER: dench
@DATE: 7.05
@NAME: OnRental
@TIME: 21:05
*/

import com.example.demo.services.cars.CarsServices;
import com.example.demo.services.clients.ClientsService;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OnRental {
    private String id;
    private Car car;
    private Client clients;
    private Brand brand;
    private LocalDate dateRentStart;
    private LocalDate dateRentEnd;

    public OnRental(String id, Car car, Client clients, Brand brand, LocalDate dateRentStart, LocalDate dateRentEnd) {
        this.id = id;
        this.car = car;
        this.clients = clients;
        this.brand = brand;
        this.dateRentStart = dateRentStart;
        this.dateRentEnd = dateRentEnd;
    }
}

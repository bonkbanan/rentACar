package com.example.demo.model;/*
@USER: dench
@DATE: 7.05
@NAME: OnRental
@TIME: 21:05
*/


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document
public class OnRental {
    @Id
    private String id;
    private Car car;
    private Client clients;
    private LocalDate dateRentStart;
    private LocalDate dateRentEnd;

    public OnRental(String id, Car car, Client clients, LocalDate dateRentStart, LocalDate dateRentEnd) {
        this.id = id;
        this.car = car;
        this.clients = clients;
        this.dateRentStart = dateRentStart;
        this.dateRentEnd = dateRentEnd;
    }

    public OnRental() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Client getClients() {
        return clients;
    }

    public void setClients(Client clients) {
        this.clients = clients;
    }


    public LocalDate getDateRentStart() {
        return dateRentStart;
    }

    public void setDateRentStart(LocalDate dateRentStart) {
        this.dateRentStart = dateRentStart;
    }

    public LocalDate getDateRentEnd() {
        return dateRentEnd;
    }

    public void setDateRentEnd(LocalDate dateRentEnd) {
        this.dateRentEnd = dateRentEnd;
    }

    @Override
    public String toString() {
        return "OnRental{" +
                "id='" + id + '\'' +
                ", car=" + car +
                ", clients=" + clients +
                ", dateRentStart=" + dateRentStart +
                ", dateRentEnd=" + dateRentEnd +
                '}';
    }
}

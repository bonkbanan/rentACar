package com.example.demo.model;/*
@USER: dench
@DATE: 7.05
@NAME: OnRental
@TIME: 21:05
*/

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class OnRental {
    private String idCar;
    private String idClient;
    private String brand;
    private LocalDate dateRentStart;
    private LocalDate dateRentEnd;


}

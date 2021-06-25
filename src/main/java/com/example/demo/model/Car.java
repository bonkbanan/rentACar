package com.example.demo.model;/*
@USER: dench
@DATE: 7.05
@NAME: Car
@TIME: 21:03
*/

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String id;
    private Brand brand;
    private Integer priceCar;
    private Integer priceCarForRent;
    private String type;

    public Car(String id) {
        this.id = id;
    }

    public Car(Brand brand) {
        this.brand = brand;
    }
}

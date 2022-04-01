package com.example.demo.model;/*
@USER: dench
@DATE: 7.05
@NAME: Car
@TIME: 21:03
*/

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Car {
    @Id
    private String id;
    private Brand brand;
    private String model;
    private Integer priceCar;
    private Integer priceCarForRent;
    private String type;

    public Car(String id) {
        this.id = id;
    }


    public Car(String id, Brand brand, String model, Integer priceCar, Integer priceCarForRent, String type) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.priceCar = priceCar;
        this.priceCarForRent = priceCarForRent;
        this.type = type;
    }


    public Car() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Integer getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(Integer priceCar) {
        this.priceCar = priceCar;
    }

    public Integer getPriceCarForRent() {
        return priceCarForRent;
    }

    public void setPriceCarForRent(Integer priceCarForRent) {
        this.priceCarForRent = priceCarForRent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brand=" + brand +
                ", model='" + model + '\'' +
                ", priceCar=" + priceCar +
                ", priceCarForRent=" + priceCarForRent +
                ", type='" + type + '\'' +
                '}';
    }
}

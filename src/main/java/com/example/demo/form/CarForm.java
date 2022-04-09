package com.example.demo.form;

import com.example.demo.model.Brand;

public class CarForm {
    private Brand brand;
    private String model;
    private String carPlate;
    private int priceCar;
    private int priceCarForRent;
    private String type;

    public CarForm(Brand brand, String model, String carPlate, int priceCar, int priceCarForRent, String type) {
        this.brand = brand;
        this.model = model;
        this.carPlate = carPlate;
        this.priceCar = priceCar;
        this.priceCarForRent = priceCarForRent;
        this.type = type;
    }

    public CarForm() {
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(int priceCar) {
        this.priceCar = priceCar;
    }

    public int getPriceCarForRent() {
        return priceCarForRent;
    }

    public void setPriceCarForRent(int priceCarForRent) {
        this.priceCarForRent = priceCarForRent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CarForm{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", carPlate='" + carPlate + '\'' +
                ", priceCar=" + priceCar +
                ", priceCarForRent=" + priceCarForRent +
                ", type='" + type + '\'' +
                '}';
    }
}

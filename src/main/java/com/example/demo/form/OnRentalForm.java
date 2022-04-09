package com.example.demo.form;

import com.example.demo.model.Car;
import com.example.demo.model.Client;

import java.time.LocalDate;
import java.util.Date;

public class OnRentalForm {
    private String carPlate;
    private String clientsId;
    private String dateRentStart;
    private String dateRentEnd;


    public OnRentalForm(String carPlate, String clientsId, String dateRentStart, String dateRentEnd) {
        this.carPlate = carPlate;
        this.clientsId = clientsId;
        this.dateRentStart = dateRentStart;
        this.dateRentEnd = dateRentEnd;
    }

    public OnRentalForm() {
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getClientsId() {
        return clientsId;
    }

    public void setClientsId(String clientsId) {
        this.clientsId = clientsId;
    }

    public String getDateRentStart() {
        return dateRentStart;
    }

    public void setDateRentStart(String dateRentStart) {
        this.dateRentStart = dateRentStart;
    }

    public String  getDateRentEnd() {
        return dateRentEnd;
    }

    public void setDateRentEnd(String dateRentEnd) {
        this.dateRentEnd = dateRentEnd;
    }

    @Override
    public String toString() {
        return "OnRentalForm{" +
                "carPlate='" + carPlate + '\'' +
                ", clientsId='" + clientsId + '\'' +
                ", dateRentStart=" + dateRentStart +
                ", dateRentEnd=" + dateRentEnd +
                '}';
    }
}

package com.example.demo.form;

import com.example.demo.model.Car;
import com.example.demo.model.Client;

import java.time.LocalDate;

public class OnRentalForm {
    private String carId;
    private String clientsId;
    private LocalDate dateRentStart;
    private LocalDate dateRentEnd;


    public OnRentalForm(String carId, String clientsId, LocalDate dateRentStart, LocalDate dateRentEnd) {
        this.carId = carId;
        this.clientsId = clientsId;
        this.dateRentStart = dateRentStart;
        this.dateRentEnd = dateRentEnd;
    }

    public OnRentalForm() {
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getClientsId() {
        return clientsId;
    }

    public void setClientsId(String clientsId) {
        this.clientsId = clientsId;
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
        return "OnRentalForm{" +
                "carId=" + carId +
                ", clientsId=" + clientsId +
                ", dateRentStart=" + dateRentStart +
                ", dateRentEnd=" + dateRentEnd +
                '}';
    }
}

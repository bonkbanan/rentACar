package com.example.demo.controller.rest;

import com.example.demo.model.OnRental;
import com.example.demo.services.onRental.OnRentalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class OnRentalController {
    @Autowired
    OnRentalServices service;

    @RequestMapping("/rentalcar")
    List<OnRental> getAll(){
        return service.getAll();}
}

package com.example.demo.controller.rest;

import com.example.demo.model.Car;
import com.example.demo.services.cars.CarsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class CarController {
   @Autowired
    CarsServices service;
    @RequestMapping("/cars")
    List<Car> getAll(){return service.getAll();}
}

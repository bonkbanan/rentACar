package com.example.demo.controller.rest;

import com.example.demo.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CarController {
    private List<Car> cars=new ArrayList<>(
            Arrays.asList(
                    new Car("1","Toyota",31000,40,"Crossover"),
                    new Car("2","Toyota",19000,26,"sedan"),
                    new Car("3","Nissan",25000,30,"jeep"),
                    new Car("4","Rols Roys",310000,700,"cabriolet"),
                    new Car("5","Toyota",50000,90,"Crossover")
            )
    );
    @RequestMapping("/cars")
    List<Car> getAll(){return cars;}
}

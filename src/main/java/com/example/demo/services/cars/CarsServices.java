package com.example.demo.services.cars;

import com.example.demo.model.Car;
import com.example.demo.model.OnRental;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsServices {
    private List<Car> cars;
    private List<Car> cars2;

    @PostConstruct
    void init(){
        cars=new ArrayList<>(
                Arrays.asList(
                        new Car("1","Toyota",31000,40,"Crossover"),
                        new Car("2","Toyota",19000,26,"sedan"),
                        new Car("3","Nissan",25000,30,"jeep"),
                        new Car("4","Rols Roys",310000,700,"cabriolet"),
                        new Car("5","Toyota",50000,90,"Crossover")
                )
        );
        cars2=cars;
    }
    public List<Car> getAll(){return cars;}

    public List<Car> reNew(){
        return cars=cars2;
    }

    public void delete(String id){
        cars=cars.stream().filter(rent->!rent.getId().equals(id))
                .collect(Collectors.toList());
    }

}

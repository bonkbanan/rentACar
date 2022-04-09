package com.example.demo.services.cars;

import com.example.demo.model.Brand;
import com.example.demo.model.Car;
import com.example.demo.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsServices {
    private List<Car> cars;

    @Autowired
    CarsRepository repository;

    @PostConstruct
    void init(){
        cars=new ArrayList<>(
                Arrays.asList(
                        new Car("1", Brand.RENAULT,"Kadjar","CE7654AX",31000,40,"Crossover"),
                        new Car("2",Brand.TOYOTA,"Camry","CE0654BC",19000,26,"sedan"),
                        new Car("3",Brand.NISSAN,"Qasqai","CE7865CE",25000,30,"jeep"),
                        new Car("4",Brand.TOYOTA,"LC300","AA6456AX",310000,700,"all-road"),
                        new Car("5",Brand.SUZUKI,"Vitara","AX7563CE",50000,90,"Crossover")
                )
        );
//        repository.saveAll(cars);

    }
    public void create(Car car) {repository.save(car);}

    public List<Car> getAll() { return repository.findAll();}

    public void reNew(){repository.saveAll(cars);}

    public void delete(String id){ repository.deleteById(id);}

    public Car get(String id){ return repository.findById(id).get();}

    public List<Car> getCarForCarPlate(String carPlate) {return repository.findAll().stream().filter(el->el.getCarPlate().equals(carPlate)).collect(Collectors.toList());}

    public void update(Car car) {repository.save(car); }

}

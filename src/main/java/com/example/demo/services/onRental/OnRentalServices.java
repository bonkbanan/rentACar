package com.example.demo.services.onRental;

import com.example.demo.model.OnRental;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OnRentalServices {
    private List<OnRental> rentals;
    private List<OnRental> rentals2;
    @PostConstruct
    void init(){
        rentals = new ArrayList<>(
                Arrays.asList(
                        new OnRental("1","1","Toyota", LocalDate.of(2021, Month.APRIL,5),LocalDate.of(2021,Month.MAY,15)),
                        new OnRental("2","2","Toyota", LocalDate.of(2021, Month.JANUARY,14),LocalDate.of(2021,Month.APRIL,5)),
                        new OnRental("3","3","Nissan", LocalDate.of(2021, Month.FEBRUARY,8),LocalDate.of(2021,Month.JULY,20)),
                        new OnRental("4","4","Rols Roys", LocalDate.of(2021, Month.MARCH,1),LocalDate.of(2021,Month.MAY,1)),
                        new OnRental("5","5","Toyota", LocalDate.of(2021, Month.APRIL,6),LocalDate.of(2021,Month.NOVEMBER,15))
                )
        );
        rentals2=rentals;
    }
    public List<OnRental> getAll(){return rentals;}

    public List<OnRental> reNew(){
        return rentals=rentals2;
    }

    public void delete(String id){
        rentals=rentals.stream().filter(rent->!rent.getIdCar().equals(id))
                .collect(Collectors.toList());
    }
}

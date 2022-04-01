package com.example.demo.services.onRental;

import com.example.demo.model.Brand;
import com.example.demo.model.Client;
import com.example.demo.model.OnRental;
import com.example.demo.repository.OnRentalRepository;
import com.example.demo.services.cars.CarsServices;
import com.example.demo.services.clients.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
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
    Integer i=0;
    @Autowired
    ClientsService clientsService;
    @Autowired
    CarsServices carsServices;
    @Autowired
    OnRentalRepository repository;

    @PostConstruct
    void init(){
        rentals = new ArrayList<>(
                Arrays.asList(
                        new OnRental("1",carsServices.getAll().get(i),clientsService.getAll().get(i++), LocalDate.of(2021, Month.APRIL,5),LocalDate.of(2021,Month.MAY,15)),
                        new OnRental("2",carsServices.getAll().get(i),clientsService.getAll().get(i++), LocalDate.of(2021, Month.JANUARY,14),LocalDate.of(2021,Month.APRIL,5)),
                        new OnRental("3",carsServices.getAll().get(i),clientsService.getAll().get(i++), LocalDate.of(2021, Month.FEBRUARY,8),LocalDate.of(2021,Month.JULY,20)),
                        new OnRental("4",carsServices.getAll().get(i),clientsService.getAll().get(i++), LocalDate.of(2021, Month.MARCH,1),LocalDate.of(2021,Month.MAY,1)),
                        new OnRental("5",carsServices.getAll().get(i),clientsService.getAll().get(i++), LocalDate.of(2021, Month.APRIL,6),LocalDate.of(2021,Month.NOVEMBER,15))
                )
        );
        //repository.saveAll(rentals);
    }


    public List<OnRental> getAll() { return repository.findAll();}

    public void reNew(){repository.saveAll(rentals);}

    public void delete(String id){ repository.deleteById(id);}

    public void create(OnRental rental) {repository.save(rental);}

    public OnRental get(String id){ return repository.findById(id).get();}

    public void update(OnRental rental) {repository.save(rental); }

}

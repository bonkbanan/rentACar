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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
    void init() throws ParseException {
        Date date =new Date();
        Date date1 = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        rentals = new ArrayList<>(
                Arrays.asList(
                        new OnRental("1",carsServices.getAll().get(i),clientsService.getAll().get(i++),"09.04.2022", "15.05.2022"),
                        new OnRental("2",carsServices.getAll().get(i),clientsService.getAll().get(i++), "14.01.2022","05.04.2022"),
                        new OnRental("3",carsServices.getAll().get(i),clientsService.getAll().get(i++), "08.02.2022","20.07.2022"),
                        new OnRental("4",carsServices.getAll().get(i),clientsService.getAll().get(i++), "20.03.2022","01.05.2022"),
                        new OnRental("5",carsServices.getAll().get(i),clientsService.getAll().get(i++), "06.04.2022","15.11.2022")
                )
        );
        repository.saveAll(rentals);
    }


    public List<OnRental> getAll() { return repository.findAll();}

    public void reNew(){repository.saveAll(rentals);}

    public void delete(String id){ repository.deleteById(id);}

    public void create(OnRental rental) {repository.save(rental);}

    public OnRental get(String id){ return repository.findById(id).get();}

    public void update(OnRental rental) {repository.save(rental); }

}

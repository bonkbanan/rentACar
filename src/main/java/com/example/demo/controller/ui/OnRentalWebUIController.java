package com.example.demo.controller.ui;

import com.example.demo.form.ClientForm;
import com.example.demo.form.OnRentalForm;
import com.example.demo.model.Client;
import com.example.demo.model.OnRental;
import com.example.demo.services.cars.CarsServices;
import com.example.demo.services.clients.ClientsService;
import com.example.demo.services.onRental.OnRentalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/ui/onrental")
public class OnRentalWebUIController {

    @Autowired
    OnRentalServices service;

    @Autowired
    CarsServices carsServices;

    @Autowired
    ClientsService clientsService;

    @RequestMapping()
    String getAll(Model model){
        model.addAttribute("onRental",service.getAll());
        return "onRental";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model, @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("onRental",service.getAll());
        return "onRental";
    }
    @RequestMapping("/renew")
    String renew(Model model){
        service.reNew();
        model.addAttribute("onRental",service.getAll());
        return "onRental";
    }

    @GetMapping("/create")
    String create(Model model){
        OnRentalForm rentalForm = new OnRentalForm();
        model.addAttribute("onRental", rentalForm);
        return "createOnRental";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("onRental") OnRentalForm rentalForm){
        OnRental onRental= new OnRental();
        onRental.setCar(carsServices.getAll().stream().filter(el->el.getId().equals(rentalForm.getCarId())).collect(Collectors.toList()).get(0));
        onRental.setClients(clientsService.getAll().stream().filter(el->el.getId().equals(rentalForm.getClientsId())).collect(Collectors.toList()).get(0));
        onRental.setDateRentStart(rentalForm.getDateRentStart());
        onRental.setDateRentEnd(rentalForm.getDateRentEnd());
        service.create(onRental);
        model.addAttribute("onRental",service.getAll());
        return "onRental";
    }

    @GetMapping("/update/{id}")
    String update(Model model,  @PathVariable("id") String id){
        OnRental rental= service.get(id);
        OnRentalForm onRental = new OnRentalForm();

        onRental.setCarId(rental.getCar().getId());
        onRental.setClientsId(rental.getClients().getId());
        onRental.setDateRentStart(rental.getDateRentStart());
        onRental.setDateRentEnd(rental.getDateRentEnd());
        model.addAttribute("onRental", onRental);
        return "onRentalUpdate";
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    String update(Model model, @ModelAttribute("onRental") OnRentalForm rentalForm){
        OnRental onRental= new OnRental();
        onRental.setCar(carsServices.getAll().stream().filter(el->el.getId().equals(rentalForm.getCarId())).collect(Collectors.toList()).get(0));
        onRental.setClients(clientsService.getAll().stream().filter(el->el.getId().equals(rentalForm.getClientsId())).collect(Collectors.toList()).get(0));
        onRental.setDateRentStart(rentalForm.getDateRentStart());
        onRental.setDateRentEnd(rentalForm.getDateRentEnd());
        service.update(onRental);
        model.addAttribute("onRental",service.getAll());
        return "onRental";
    }

}

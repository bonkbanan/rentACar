package com.example.demo.controller.ui;

import com.example.demo.form.CarForm;
import com.example.demo.form.ClientForm;
import com.example.demo.form.OnRentalForm;
import com.example.demo.model.Car;
import com.example.demo.model.Client;
import com.example.demo.model.OnRental;
import com.example.demo.services.cars.CarsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;


@Controller
@RequestMapping("/ui/car")
public class CarWebUIController {

    @Autowired
    CarsServices service;

    @RequestMapping()
    String getAll(Model model){
        model.addAttribute("cars",service.getAll());
        return "cars";
    }
    @RequestMapping("/delete/{id}")
    String delete(Model model, @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("cars",service.getAll());
        return "cars";
    }

    @RequestMapping("/renew")
    String reNew(Model model){
        service.reNew();
        model.addAttribute("cars",service.getAll());
        return "cars";
    }

    @GetMapping("/create")
    String create(Model model){
        CarForm carForm = new CarForm();
        model.addAttribute("cars", carForm);
        return "createcar";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("cars") CarForm cars){
        Car car= new Car();
        car.setBrand(cars.getBrand());
        car.setModel(cars.getModel());
        car.setPriceCar(cars.getPriceCar());
        car.setPriceCarForRent(cars.getPriceCarForRent());
        car.setType(cars.getType());
        service.create(car);
        model.addAttribute("cars",service.getAll());
        return "cars";
    }
    @GetMapping("/update/{id}")
    String update(Model model,  @PathVariable("id") String id){
        Car car= service.get(id);
        CarForm carForm = new CarForm();
        carForm.setBrand(car.getBrand());
        carForm.setModel(car.getModel());
        carForm.setPriceCar(car.getPriceCar());
        carForm.setPriceCarForRent(car.getPriceCarForRent());
        carForm.setType(car.getType());
        model.addAttribute("cars",carForm);
        return "carsUpdate";
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    String update(Model model, @ModelAttribute("cars") CarForm cars){
        Car car= new Car();
        car.setBrand(cars.getBrand());
        car.setModel(cars.getModel());
        car.setPriceCar(cars.getPriceCar());
        car.setPriceCarForRent(cars.getPriceCarForRent());
        car.setType(cars.getType());
        service.update(car);
        model.addAttribute("cars",service.getAll());
        return "cars";
    }

    @RequestMapping("/{id}")
    String getOne(Model model, @PathVariable("id") String id){
        model.addAttribute("cars",service.getAll().stream().filter(el->el.getId().equals(id)).collect(Collectors.toList()));
        return "extracars";
    }
}

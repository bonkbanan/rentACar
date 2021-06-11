package com.example.demo.controller.ui;

import com.example.demo.model.Car;
import com.example.demo.services.cars.CarsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        model.addAttribute("cars",service.reNew());
        return "cars";
    }
}

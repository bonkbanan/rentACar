package com.example.demo.controller.ui;

import com.example.demo.model.OnRental;
import com.example.demo.services.onRental.OnRentalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/ui/onrental")
public class OnRentalWebUIController {

    @Autowired
    OnRentalServices service;

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
        model.addAttribute("onRental",service.reNew());
        return "onRental";
    }
}

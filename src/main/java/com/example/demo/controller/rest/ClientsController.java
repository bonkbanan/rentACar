package com.example.demo.controller.rest;

import com.example.demo.model.Clients;
import com.example.demo.services.clients.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ClientsController {
    @Autowired
    ClientsService service;

    @RequestMapping("/clients")
    List<Clients> getAll(){return service.getAll();}
}

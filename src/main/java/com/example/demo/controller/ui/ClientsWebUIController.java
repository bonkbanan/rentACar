package com.example.demo.controller.ui;

import com.example.demo.services.clients.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ui/clients")
public class ClientsWebUIController {
    @Autowired
    ClientsService service;

    @RequestMapping()
    String getAll(Model model){
        model.addAttribute("client",service.getAll());
        return "clients";}

    @RequestMapping("/delete{id}")
    String delete(Model model, @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("clients",service.getAll());
        return "clients";
    }

    @RequestMapping("/renew")
    String reNew(Model model){
        model.addAttribute("clients",service.reNew());
        return "clients";
    }
}

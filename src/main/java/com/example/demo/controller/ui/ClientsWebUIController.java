package com.example.demo.controller.ui;

import com.example.demo.form.ClientForm;
import com.example.demo.model.Client;
import com.example.demo.services.clients.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;


@Controller
@RequestMapping("/ui/clients")
public class ClientsWebUIController {
    @Autowired
    ClientsService service;

    @RequestMapping()
    String getAll(Model model){
        model.addAttribute("clients",service.getAll());
        return "clients";}

    @RequestMapping("/delete/{id}")
    String delete(Model model, @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("clients",service.getAll());
        return "clients";
    }

    @RequestMapping("/renew")
    String reNew(Model model){
        service.reNew();
        model.addAttribute("clients",service.getAll());
        return "clients";
    }

    @GetMapping("/create")
    String create(Model model){
        ClientForm clientForm = new ClientForm();
        model.addAttribute("clients", clientForm);
        return "createclient";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("clients") ClientForm clients){
        Client client= new Client();
        client.setSurname(clients.getSurname());
        client.setName(clients.getName());
        client.setSecondName(clients.getSecondName());
        client.setStreet(clients.getStreet());
        client.setTelephoneNumber(clients.getTelephoneNumber());
        service.create(client);
        model.addAttribute("clients",service.getAll());
        return "clients";
    }

    @GetMapping("/update/{id}")
    String update(Model model,  @PathVariable("id") String id){
        Client clients= service.get(id);
        ClientForm clientForm = new ClientForm();
        clientForm.setSurname(clients.getSurname());
        clientForm.setName(clients.getName());
        clientForm.setSecondName(clients.getSecondName());
        clientForm.setStreet(clients.getStreet());
        clientForm.setTelephoneNumber(clients.getTelephoneNumber());
        model.addAttribute("clients", clientForm);
        return "updateclient";
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    String update(Model model, @ModelAttribute("clients") ClientForm clients){
        Client client= new Client();
        client.setSurname(clients.getSurname());
        client.setName(clients.getName());
        client.setSecondName(clients.getSecondName());
        client.setStreet(clients.getStreet());
        client.setTelephoneNumber(clients.getTelephoneNumber());
        service.update(client);
        model.addAttribute("clients",service.getAll());
        return "clients";
    }

    @RequestMapping("/{id}")
    String getOne(Model model, @PathVariable("id") String id){
        model.addAttribute("clients",service.getAll().stream().filter(el->el.getId().equals(id)).collect(Collectors.toList()));
        return "clients";
    }
}

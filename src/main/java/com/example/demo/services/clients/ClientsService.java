package com.example.demo.services.clients;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ClientsService {
    private List<Client> clients;


    @Autowired
    ClientRepository repository;

    @PostConstruct
    void init(){
       clients = new ArrayList<>(
                Arrays.asList(
                        new Client("1","Cheban","Katya","Vasilivna","golovna 15","880035535"),
                        new Client("2","Cherney","Oleksiy","Igorovich","Who know where","8800333335"),
                        new Client("3","Kozlow","Pasha","Ivanovich","gagarina5","64586458648"),
                        new Client("4","Cherbakow","Ivan","Pashkevich","godiliv 8","46857568478"),
                        new Client("5","Karlowna","Katya","Vasilivna","golovna 15","447458645864")
                )
       );
       //repository.saveAll(clients);
    }

    public List<Client> getAll() { return repository.findAll();}

    public void reNew(){repository.saveAll(clients);}

    public void delete(String id){ repository.deleteById(id);}

    public void create(Client client) {repository.save(client);}

    public Client get(String id){ return repository.findById(id).get();}

    public void update(Client client) {repository.save(client); }
}
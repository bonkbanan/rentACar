package com.example.demo.services.clients;

import com.example.demo.model.Clients;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientsService {
    private List<Clients> clients;
    private List<Clients> clients2;

    @PostConstruct
    void init(){
       clients = new ArrayList<>(
                Arrays.asList(
                        new Clients("1","Cheban","Katya","Vasilivna","golovna 15","880035535"),
                        new Clients("2","Cherney","Oleksiy","Igorovich","Who know where","8800333335"),
                        new Clients("3","Kozlow","Pasha","Ivanovich","gagarina5","64586458648"),
                        new Clients("4","Cherbakow","Ivan","Pashkevich","godiliv 8","46857568478"),
                        new Clients("5","Karlowna","Katya","Vasilivna","golovna 15","447458645864")
                )
       );
       clients2 = clients;
    }

    public List<Clients> getAll() { return clients;}

    public List<Clients> reNew(){return clients=clients2;}

    public void delete(String id){
        clients = clients.stream().filter(item->!item.getId().equals(id))
                .collect(Collectors.toList());
    }
}

package com.example.demo.model;/*
@USER: dench
@DATE: 7.05
@NAME: Clients
@TIME: 21:04
*/

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private String id;
    private String surname;
    private String name;
    private String secondName;
    private String street;
    private String telephoneNumber;

}

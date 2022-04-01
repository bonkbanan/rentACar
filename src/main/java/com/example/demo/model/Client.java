package com.example.demo.model;/*
@USER: dench
@DATE: 7.05
@NAME: Clients
@TIME: 21:04
*/



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client {
    @Id
    private String id;
    private String surname;
    private String name;
    private String secondName;
    private String street;
    private String telephoneNumber;

    public Client() {
    }

    public Client(String id, String surname, String name, String secondName, String street, String telephoneNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.street = street;
        this.telephoneNumber = telephoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", street='" + street + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}

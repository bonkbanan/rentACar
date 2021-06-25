package com.example.demo.model;/*
@USER: dench
@DATE: 7.05
@NAME: Clients
@TIME: 21:04
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Client {
    @Id
    private String id;
    private String surname;
    private String name;
    private String secondName;
    private String street;
    private String telephoneNumber;

}

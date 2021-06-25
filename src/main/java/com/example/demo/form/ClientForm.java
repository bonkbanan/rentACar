package com.example.demo.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientForm {
    private String id;
    private String surname;
    private String name;
    private String secondName;
    private String street;
    private String telephoneNumber;
}

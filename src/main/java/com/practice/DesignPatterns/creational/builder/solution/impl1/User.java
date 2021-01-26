package com.practice.DesignPatterns.creational.builder.solution.impl1;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Address address;
}

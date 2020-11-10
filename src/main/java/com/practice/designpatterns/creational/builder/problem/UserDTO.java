package com.practice.designpatterns.creational.builder.problem;

import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
public class UserDTO {
    private String name;
    private int age;
    private String address;

    public UserDTO (String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        this.name = firstName + " " + lastName;
        this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        this.address = "House No: " + address.getHouseNumber() + ", Street Number: " + address.getStreetNumber() + "\n" +
                "Locality: " + address.getLocality() + ", City: " + address.getCity() + "\n" +
                "State: " + address.getState() + ", Pincode: " + address.getPincode();
    }
}

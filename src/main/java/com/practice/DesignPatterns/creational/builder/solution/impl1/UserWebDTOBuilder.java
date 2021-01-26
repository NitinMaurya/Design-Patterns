package com.practice.DesignPatterns.creational.builder.solution.impl1;

import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
public class UserWebDTOBuilder implements UserDTOBuilder {
    private String name;
    private int age;
    private String address;
    private UserDTO userDTO;

    public UserWebDTOBuilder firstName(String firstName) {
        this.name = firstName;
        return this;
    }

    public UserWebDTOBuilder lastName(String lastName) {
        this.name += " " + lastName;
        return this;
    }

    public UserWebDTOBuilder dateOfBirth(LocalDate dateOfBirth) {
        this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        return this;
    }

    public UserWebDTOBuilder address(Address address) {
        this.address = "House No: " + address.getHouseNumber() + ", Street Number: " + address.getStreetNumber() + "\n" +
                "Locality: " + address.getLocality() + ", City: " + address.getCity() + "\n" +
                "State: " + address.getState() + ", Pincode: " + address.getPincode();
        return this;
    }

    public UserDTO build() {
        UserWebDTO userWebDTO = new UserWebDTO();
        userWebDTO.setName(this.name);
        userWebDTO.setAddress(this.address);
        userWebDTO.setAge(this.age);
        this.userDTO = userWebDTO;
        return userWebDTO;
    }
}

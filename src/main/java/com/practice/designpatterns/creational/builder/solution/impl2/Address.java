package com.practice.designpatterns.creational.builder.solution.impl2;

import lombok.Data;

@Data
public class Address {
    private String houseNumber;
    private String streetNumber;
    private String locality;
    private String state;
    private String city;
    private String pincode;
}

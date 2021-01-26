package com.practice.DesignPatterns.creational.builder.solution.impl1;

import lombok.Data;

@Data
public class UserWebDTO implements UserDTO {
    private String name;
    private int age;
    private String address;
}

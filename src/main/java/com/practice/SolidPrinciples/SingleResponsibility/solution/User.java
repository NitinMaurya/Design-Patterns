package com.practice.SolidPrinciples.SingleResponsibility.solution;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private String name;
    private String email;
    private String address;
}
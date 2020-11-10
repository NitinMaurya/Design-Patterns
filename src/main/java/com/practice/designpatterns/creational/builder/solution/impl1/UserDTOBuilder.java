package com.practice.designpatterns.creational.builder.solution.impl1;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder firstName(String firstName);
    UserDTOBuilder lastName(String lastName);
    UserDTOBuilder dateOfBirth(LocalDate dateOfBirth);
    UserDTOBuilder address(Address address);
    UserDTO build();
}

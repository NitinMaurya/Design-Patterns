package com.practice.designpatterns.creational.builder.solution.impl2;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user = createUser();

        UserDTO userDTO = build(new UserDTO.Builder(), user);
        System.out.println(userDTO);
        System.out.println("***************************");
    }

    private static UserDTO build(UserDTO.Builder builder, User user) {
        return builder
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .address(user.getAddress())
                .dateOfBirth(user.getDateOfBirth())
                .build();
    }

    // User object fetched from persistent unit.
    public static User createUser() {
        User user = new User();
        user.setFirstName("Nitin");
        user.setLastName("Maurya");
        user.setDateOfBirth(LocalDate.of(1997,  5, 27));
        Address address = new Address();
        address.setHouseNumber("672/A");
        address.setStreetNumber("16");
        address.setLocality("Aadarsh Mohalla, Maujpur");
        address.setCity("North-East Delhi");
        address.setState("Delhi");
        address.setPincode("110053");
        user.setAddress(address);
        return user;
    }
}

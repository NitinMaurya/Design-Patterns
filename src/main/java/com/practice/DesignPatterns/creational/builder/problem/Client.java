package com.practice.DesignPatterns.creational.builder.problem;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDTO userDTO = build(user);
        System.out.println(userDTO);
    }

    private static UserDTO build(User user) {
        return new UserDTO(user.getFirstName(), user.getLastName(), user.getDateOfBirth(), user.getAddress());
        // the problem here is that if the no of fields for user increases so does the no of arguments in the
        // constructor of the UserDTO for creating the object.
        // And if the arguments are covariant it will be difficult for client to keep track of the arguments and their types.
        // and the constructor is always preferred to only initialize the member variables of the class.
        // there must not be any logic in the constructor.
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

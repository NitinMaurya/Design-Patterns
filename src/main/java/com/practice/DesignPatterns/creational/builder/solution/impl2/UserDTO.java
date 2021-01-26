package com.practice.DesignPatterns.creational.builder.solution.impl2;

import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
public class UserDTO {
    private String name;
    private int age;
    private String address;

    private UserDTO(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;

        public Builder firstName(String firstName) {
            this.name = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.name += " " + lastName;
            return this;
        }
        public Builder dateOfBirth(LocalDate dateOfBirth) {
            this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();
            return this;
        }
        public Builder address(Address address) {
            this.address = "House No: " + address.getHouseNumber() + ", Street Number: " + address.getStreetNumber() + "\n" +
                    "Locality: " + address.getLocality() + ", City: " + address.getCity() + "\n" +
                    "State: " + address.getState() + ", Pincode: " + address.getPincode();
            return this;
        }

        public UserDTO build() {
            return new UserDTO(this);
        }

    }
}

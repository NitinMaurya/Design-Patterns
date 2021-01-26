package com.practice.DesignPatterns.creational.simpleFactory.solution;

public class Client {
    public static void main(String[] args) {
        Car luxury  = CarFactory.createCar("luxury");
        System.out.println("Car: " + luxury);

        Car sedan  = CarFactory.createCar("sedan");
        System.out.println("Car: " + sedan);
    }
}

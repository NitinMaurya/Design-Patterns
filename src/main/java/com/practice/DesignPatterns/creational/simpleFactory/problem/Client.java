package com.practice.DesignPatterns.creational.simpleFactory.problem;

public class Client {
    public static void main(String[] args) {
        Car luxury  = createCar("luxury");
        System.out.println("Car: " + luxury);

        Car sedan  = createCar("sedan");
        System.out.println("Car: " + sedan);
    }

    private static Car createCar(String input) {
        if ("luxury".equals(input)) {
            return new LuxuryCar();
        } else if ("peopleMover".equals(input)) {
            return new PeopleMoverCar();
        } else if ("sedan".equals(input)) {
            return new SedanCar();
        } else {
            return new Car();
        }
    }
}

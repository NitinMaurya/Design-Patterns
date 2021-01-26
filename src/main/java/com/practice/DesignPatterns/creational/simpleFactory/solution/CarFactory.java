package com.practice.DesignPatterns.creational.simpleFactory.solution;

public class CarFactory {
    public static Car createCar(String carType) {
        switch (carType) {
            case "luxury": return new LuxuryCar();
            case "sedan": return new SedanCar();
            case "peopleMover": return new PeopleMoverCar();
            default: return new Car();
        }
    }
}

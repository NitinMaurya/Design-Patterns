package com.practice.DesignPatterns.creational.decorator;

public class Cappuchino implements Coffee {

    @Override
    public String description() {
        return "Order: Cappuchino";
    }

    @Override
    public int cost() {
        return 3;
    }
}

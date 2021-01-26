package com.practice.DesignPatterns.creational.decorator.client;


import com.practice.DesignPatterns.creational.decorator.Coffee;
import com.practice.DesignPatterns.creational.decorator.Espresso;
import com.practice.DesignPatterns.creational.decorator.Latte;
import com.practice.DesignPatterns.creational.decorator.MochaDecorator;
import com.practice.DesignPatterns.creational.decorator.WhippedCreamDecorator;

public class Client {
    public static void main(String[] args) {
        Coffee coffeeA = new MochaDecorator(new Espresso());
        System.out.println(coffeeA.description());
        System.out.println(coffeeA.cost());

        Coffee coffeeB = new WhippedCreamDecorator(new MochaDecorator(new Latte()));
        System.out.println(coffeeB.description());
        System.out.println(coffeeB.cost());
    }
}

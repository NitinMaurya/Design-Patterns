package com.practice.DesignPatterns.behavioural.strategy.duck.client;


import com.practice.DesignPatterns.behavioural.strategy.duck.CloudFlyable;
import com.practice.DesignPatterns.behavioural.strategy.duck.Duck;
import com.practice.DesignPatterns.behavioural.strategy.duck.LoudQuackable;
import com.practice.DesignPatterns.behavioural.strategy.duck.NonFlyable;
import com.practice.DesignPatterns.behavioural.strategy.duck.NonQuackable;

public class Client {
    public static void main(String[] args) {
        print(new Duck(new LoudQuackable(), new CloudFlyable()));
        print(new Duck(new NonQuackable(), new NonFlyable()));
    }

    private static void print(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

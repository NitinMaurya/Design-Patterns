package com.practice.DesignPatterns.behavioural.strategy.duck;

public class NonFlyable implements FlyableStrategy {
    @Override
    public void fly() {
        System.out.println("Cannot Fly");
    }
}

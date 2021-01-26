package com.practice.DesignPatterns.behavioural.observer;

public class MobileObserver implements Observer {
    @Override
    public void update(WeatherStation observable) {
        System.out.println("Mobile Got update: Temperature = " + observable.getTemperature());
    }
}

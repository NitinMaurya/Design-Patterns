package com.practice.DesignPatterns.behavioural.observer.client;


import com.practice.DesignPatterns.behavioural.observer.MobileObserver;
import com.practice.DesignPatterns.behavioural.observer.SatelliteObserver;
import com.practice.DesignPatterns.behavioural.observer.WeatherStation;

public class Client {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.add(new MobileObserver());
        station.add(new SatelliteObserver());
        station.setTemperature(36.5);
        System.out.println(station.getTemperature());
    }
}

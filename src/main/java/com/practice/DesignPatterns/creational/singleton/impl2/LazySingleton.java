package com.practice.DesignPatterns.creational.singleton.impl2;

public class LazySingleton {
    private static final LazySingleton INSTANCE = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        return new LazySingleton();
    }
}

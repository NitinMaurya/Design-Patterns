package com.practice.SolidPrinciples.SingleResponsibility.problem;

import java.util.HashMap;
import java.util.Map;

//Stores data in memory
public class Store {

    private static final Map<String, User> STORAGE = new HashMap<>();

    public void save(User user) {
        synchronized(STORAGE) {
            STORAGE.put(user.getName(), user);
        }
    }

    public User findByName(String name) {
        synchronized(STORAGE) {
            return STORAGE.get(name);
        }
    }
}
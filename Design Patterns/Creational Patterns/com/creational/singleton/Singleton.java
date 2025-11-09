package com.creational.singleton;

public class Singleton {

    private static Singleton singleton;

    //constructor - to create method
    private Singleton() {

    }

    // method to get object
    //Lazy way of creating object (Lazy initialization)
    public static Singleton getObject() {

        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;

    }
}

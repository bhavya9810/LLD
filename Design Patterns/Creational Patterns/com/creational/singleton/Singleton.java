package com.creational.singleton;

import java.io.Serializable;


//implemented Serializable only when breaking singleton using deserialization
//implemented Cloneable only when breaking singleton using clone
public class Singleton implements Serializable,Cloneable {

    private static Singleton singleton;

    //constructor - to create object (making it private)
    private Singleton() {

        // solution 1 for reflection api
//        if(singleton!=null) throw new RuntimeException("You are trying to break singleton pattern");
    }

    // method to get object
    //Lazy way of creating object (Lazy initialization)
    public static Singleton getObject() {

        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;

    }

    // Ensures the same instance during deserialization
    public Object readResolve(){
        return getObject();
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
//        return super.clone();

        //solution after overriding clone method return our instance
        return getObject();
    }
}

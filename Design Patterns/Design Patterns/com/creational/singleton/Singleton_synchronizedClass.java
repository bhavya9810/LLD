package com.creational.singleton;

public class Singleton_synchronizedClass {

    private static Singleton_synchronizedClass singleton;

    private Singleton_synchronizedClass(){}

    public static synchronized Singleton_synchronizedClass getObject(){

        if(singleton==null){
            singleton=new Singleton_synchronizedClass();
        }

        return singleton;
    }
}

package com.creational.singleton;

public class Singleton_EagerWay {

    //Eager initialization (we will create the object here only)
    private static Singleton_EagerWay singleton=new Singleton_EagerWay();

    private Singleton_EagerWay(){

    }

    public static Singleton_EagerWay getObject_EagerWay(){
        return singleton;
    }


}

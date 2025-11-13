package com.creational.abstractFactory;

public class DevopsEngineer implements Employee{
    @Override
    public int salary() {
        return 60000;
    }

    @Override
    public String name() {
        System.out.println("I am devOps engineer");
        return "devOps engineer";
    }
}

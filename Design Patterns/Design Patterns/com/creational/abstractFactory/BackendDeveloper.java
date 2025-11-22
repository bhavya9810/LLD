package com.creational.abstractFactory;

public class BackendDeveloper implements Employee{
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        System.out.println("I am backend developer");
        return "backend developer";
    }
}

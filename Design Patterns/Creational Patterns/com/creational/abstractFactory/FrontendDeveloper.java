package com.creational.abstractFactory;

public class FrontendDeveloper implements Employee{
    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String name() {
        System.out.println("I am frontend developer");
        return "frontend developer";
    }
}

package com.creational.shallowCopy;

public class Employee implements Cloneable{

    String name;
    Address address;

    Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }


}

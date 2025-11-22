package com.creational.shallowCopy;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1=new Employee("Bhavya",new Address("Uttar Pradesh"));
        Employee e2=(Employee) e1.clone();

        System.out.println(e1.address.city);
        System.out.println(e2.address.city);

        e1.address.city="Delhi";

        System.out.println(e2.address.city);

    }
}

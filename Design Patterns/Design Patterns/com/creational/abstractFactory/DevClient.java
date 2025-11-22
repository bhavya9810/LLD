package com.creational.abstractFactory;

public class DevClient {

    public static void main(String[] args) {

        Employee emp = EmployeeFactory.getEmployee(new BackendDevFactory());

        emp.name();
        System.out.println(emp.salary());


        Employee emp2 = EmployeeFactory.getEmployee(new DevopsEnggFactory());

        emp2.name();
        System.out.println(emp2.salary());
    }
}

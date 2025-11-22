package com.creational.factory;

public class DeveloperClient {

    public static void main(String[] args) {


//          Tightly coupled classes
//        Employee employee1=new AndroidDeveloper();
//        Employee employee2=new WebDeveloper();
//        System.out.println(employee1.salary());
//        System.out.println(employee2.salary());

//        Loosely coupled
        Employee emp=EmployeeFactory.getEmployee("web");

        System.out.println(emp.salary());

    }
}

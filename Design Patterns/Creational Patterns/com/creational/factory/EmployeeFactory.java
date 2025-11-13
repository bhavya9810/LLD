package com.creational.factory;

public class EmployeeFactory {

    public static Employee getEmployee(String empType){

        if(empType.trim().equalsIgnoreCase("Android")){
            return new AndroidDeveloper();
        }
        else if(empType.trim().equalsIgnoreCase("web")){
            return new WebDeveloper();
        }
        else return null;

    }
}

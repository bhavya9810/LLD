package com.creational.abstractFactory;

public class BackendDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new BackendDeveloper();
    }
}

package com.creational.abstractFactory;

public class FrontendDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new FrontendDeveloper();
    }
}

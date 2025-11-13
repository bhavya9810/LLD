package com.creational.abstractFactory;

public class DevopsEnggFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new DevopsEngineer();
    }
}

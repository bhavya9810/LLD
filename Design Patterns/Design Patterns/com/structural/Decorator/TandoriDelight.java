package com.structural.Decorator;

public class TandoriDelight implements BasePizza{
    @Override
    public String getDescription() {
        return "Tandoori Delight Pizza";
    }

    @Override
    public double getCost() {
        return 400.0;
    }
}

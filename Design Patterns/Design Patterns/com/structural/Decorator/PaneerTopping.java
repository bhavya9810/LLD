package com.structural.Decorator;

public class PaneerTopping extends ToppingDecorator{

    public PaneerTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" + Paneer Topping";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+160.0;
    }
}

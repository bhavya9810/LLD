package com.structural.Decorator;

public class MushroomTopping extends ToppingDecorator{

    public MushroomTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" + Mushroom Topping";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+130.0;
    }
}

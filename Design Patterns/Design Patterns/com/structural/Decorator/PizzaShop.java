package com.structural.Decorator;

public class PizzaShop {

    public static void main(String[] args) {

        System.out.println("======= Decorator Design Pattern ======");

        BasePizza pizza = new ExtraCheeseTopping(new TandoriDelight());
        System.out.println("Order 1: " + pizza.getDescription() + " = Rs: " + pizza.getCost());

        BasePizza pizza2 = new MushroomTopping(new TandoriDelight());
        System.out.println("Order 2: " + pizza2.getDescription() + " = Rs: " + pizza2.getCost());

        BasePizza pizza3 = new PaneerTopping(new TandoriDelight());
        System.out.println("Order 3: " + pizza3.getDescription() + " = Rs: " + pizza3.getCost());

        BasePizza pizza4 = new ExtraCheeseTopping(new PaneerTopping(new MushroomTopping(new TandoriDelight())));
        System.out.println("Order 4: " + pizza4.getDescription() + " = Rs: " + pizza4.getCost());

        BasePizza pizza5 =new FarmHouse();
        System.out.println("Order 5: " + pizza5.getDescription() + " = Rs: " + pizza5.getCost());

    }
}

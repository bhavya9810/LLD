package com.behavioural.Strategy;

public class ShoppingCart {

    //context class

   private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount){
        System.out.print(this.paymentStrategy.getClass().getSimpleName()+" : ");
        paymentStrategy.processPayment(amount);
    }
}

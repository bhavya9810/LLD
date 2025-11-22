package com.behavioural.Strategy;

public class PayPalPayment implements PaymentStrategy {
    //concrete strategy

    private String emailId;

    public PayPalPayment(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void processPayment(Double amount) {
        System.out.println("Paid $ " + amount + " using paypal account " + emailId);


    }
}

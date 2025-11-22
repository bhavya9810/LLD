package com.behavioural.Strategy;

public class CreditCardPayment implements PaymentStrategy {

    //concrete strategy
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(Double amount) {
        System.out.println("Paid $ " + amount + " using credit-card ending in " + cardNumber.substring(cardNumber.length() - 4));

    }
}




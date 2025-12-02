package com.interviewQuestions.parkingLot.PaymentStarategy.concretePaymentStrategies;

import com.interviewQuestions.parkingLot.PaymentStarategy.PaymentStrategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Card payment of $ " + amount);
    }
}

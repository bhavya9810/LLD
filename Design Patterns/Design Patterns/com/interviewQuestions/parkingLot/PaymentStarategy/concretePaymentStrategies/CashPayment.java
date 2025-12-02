package com.interviewQuestions.parkingLot.PaymentStarategy.concretePaymentStrategies;

import com.interviewQuestions.parkingLot.PaymentStarategy.PaymentStrategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $ "+amount);
    }
}

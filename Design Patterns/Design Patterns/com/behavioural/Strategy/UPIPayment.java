package com.behavioural.Strategy;

public class UPIPayment implements PaymentStrategy {
    //concrete strategy

    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(Double amount) {

        System.out.println("Paid $ " + amount + " using UPI Id" + upiId);

    }
}

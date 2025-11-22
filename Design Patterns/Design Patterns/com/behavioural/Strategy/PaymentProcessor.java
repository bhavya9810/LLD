package com.behavioural.Strategy;

public class PaymentProcessor {

    public void processpayment(String type, double amount) {

        switch (type) {
            case "credit-card" -> {
                System.out.println("Paid $ " + amount + " using credit-card");
            }
            case "paypal" -> {
                System.out.println("Paid $ " + amount + " using paypal");
            }
            case "net-banking" -> {
                System.out.println("Paid $ " + amount + " using net-banking");
            }
            case "cash" -> {
                System.out.println("Paid $ " + amount + " using cash");
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);


        }
    }


}

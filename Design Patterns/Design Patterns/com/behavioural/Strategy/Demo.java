package com.behavioural.Strategy;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Payment Processor: Problem Demo");
        PaymentProcessor payment = new PaymentProcessor();
        payment.processpayment("credit-card",2000);
        payment.processpayment("paypal",1000);
        payment.processpayment("net-banking",200);
        payment.processpayment("cash",4000);


    }

}

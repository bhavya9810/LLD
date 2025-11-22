package com.behavioural.Strategy;

public class Demo {

    public static void main(String[] args) {
//        System.out.println("Payment Processor: Problem Demo");
//        PaymentProcessor payment = new PaymentProcessor();
//        payment.processpayment("credit-card",2000);
//        payment.processpayment("paypal",1000);
//        payment.processpayment("net-banking",200);
//        payment.processpayment("cash",4000);



        //with strategy method

        ShoppingCart shoppingCart=new ShoppingCart(new PayPalPayment("bhavya@email.com"));
        shoppingCart.checkout(2000);

        ShoppingCart shoppingCart2=new ShoppingCart(new UPIPayment("123332"));
        shoppingCart2.checkout(200);

    }

}

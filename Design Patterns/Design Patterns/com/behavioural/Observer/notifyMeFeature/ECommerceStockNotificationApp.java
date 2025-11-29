package com.behavioural.Observer.notifyMeFeature;

import com.behavioural.Observer.notifyMeFeature.observable.IphoneProductObservable;
import com.behavioural.Observer.notifyMeFeature.observable.StockAvailabilityObservable;
import com.behavioural.Observer.notifyMeFeature.observer.EmailNotificationObserver;
import com.behavioural.Observer.notifyMeFeature.observer.PushNotificationObserver;
import com.behavioural.Observer.notifyMeFeature.observer.StockNotificationObserver;

public class ECommerceStockNotificationApp {


    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("###### E-commerce Store - Stock Availability Notification Feature Demo ######");
        System.out.println();
        StockAvailabilityObservable iphoneProduct = new IphoneProductObservable("ip15", "iphone 15", 1250, 10);

        StockNotificationObserver John_PUSH = new PushNotificationObserver("John133", "AE32WS");
        StockNotificationObserver Sam_EMAIL = new EmailNotificationObserver("Sam143", "sam11@email.com");
        StockNotificationObserver Emmanual_PUSH = new PushNotificationObserver("Emmanual187", "AE11WS");
        StockNotificationObserver Smith_PUSH = new PushNotificationObserver("Smith169", "AE55WS");
        StockNotificationObserver Ponting_EMAIL = new EmailNotificationObserver("Ponting86", "ponting34@email.com");

        //black friday sale
        iphoneProduct.purchase(10);

        // Stock unavailability leads to users subscribing for notifications
        boolean success = iphoneProduct.purchase(1);

        if (!success) {
            iphoneProduct.addStockObservers(John_PUSH);
            iphoneProduct.addStockObservers(Sam_EMAIL);
            iphoneProduct.addStockObservers(Emmanual_PUSH);
            iphoneProduct.addStockObservers(Smith_PUSH);
            iphoneProduct.addStockObservers(Ponting_EMAIL);
        }

        iphoneProduct.restock(20);

        iphoneProduct.purchase(1);
        iphoneProduct.purchase(1);

        iphoneProduct.removeStockObservers(Ponting_EMAIL);
        iphoneProduct.removeStockObservers(John_PUSH);

        iphoneProduct.purchase(18);
        iphoneProduct.restock(15);

        iphoneProduct.purchase(1);
        iphoneProduct.purchase(1);

        iphoneProduct.removeStockObservers(Sam_EMAIL);
        iphoneProduct.removeStockObservers(Emmanual_PUSH);






    }
}

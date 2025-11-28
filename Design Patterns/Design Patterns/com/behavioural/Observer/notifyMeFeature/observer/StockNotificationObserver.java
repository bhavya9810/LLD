package com.behavioural.Observer.notifyMeFeature.observer;


//observer
public interface StockNotificationObserver {

    void update();

    String getNotificationMethod();

    String getUserId();
}

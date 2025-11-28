package com.behavioural.Observer.notifyMeFeature.observable;

import com.behavioural.Observer.notifyMeFeature.observer.StockNotificationObserver;

//observable
public interface StockAvailabilityObservable {

    void addStockObservers(StockNotificationObserver observer);

    void removeStockObservers(StockNotificationObserver observer);

    void notifyStockObservers();

    boolean purchase(int quantity);

    void restock(int quantity);


}

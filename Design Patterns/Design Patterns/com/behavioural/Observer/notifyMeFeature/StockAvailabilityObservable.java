package com.behavioural.Observer.notifyMeFeature;

//observable
public interface StockAvailabilityObservable {

    void addStockObservers(StockNotificationObserver observer);

    void removeStockObservers(StockNotificationObserver observer);

    void notifyStockObservers();

    boolean purchase(int quantity);

    void restock(int quantity);


}

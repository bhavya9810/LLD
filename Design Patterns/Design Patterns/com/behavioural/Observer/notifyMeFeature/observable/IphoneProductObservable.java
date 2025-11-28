package com.behavioural.Observer.notifyMeFeature.observable;

import com.behavioural.Observer.notifyMeFeature.observer.StockNotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneProductObservable implements StockAvailabilityObservable {
    private final String productId;
    private final String productName;
    private final double price;
    private final List<StockNotificationObserver> stockObservers;
    private int stockQuantity;

    public IphoneProductObservable(String productId, String productName, double price, List<StockNotificationObserver> stockObservers) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockObservers = stockObservers;
        this.stockQuantity = stockQuantity;
    }


    @Override
    public void addStockObservers(StockNotificationObserver observer) {
        stockObservers.add(observer);
        System.out.println("[+]" + observer.getUserId() + " subscribed for notification on " + productName);
    }

    @Override
    public void removeStockObservers(StockNotificationObserver observer) {
        stockObservers.remove(observer);
        System.out.println("[-]" + observer.getUserId() + " unsubscribed for notification on " + productName);
    }

    @Override
    public void notifyStockObservers() {
        if (stockQuantity > 0 && !stockObservers.isEmpty()) {
            System.out.println("Notifying " + stockObservers.size() + " subscribers... ");

            List<StockNotificationObserver> observersToNotify = new ArrayList<>(stockObservers);

            for (StockNotificationObserver observer : observersToNotify) {
                observer.update();
            }
        }

    }

    @Override
    public void restock(int quantity) {
        boolean wasOutOfStock = (stockQuantity == 0);
        stockQuantity += quantity;
        System.out.println("RESTOCKED: " + productName + " - Added " + quantity + " items " + " | " + " Current stock: " + stockQuantity);

        // only notify if product was previously out of stock
        if (wasOutOfStock && stockQuantity > 0) {
            notifyStockObservers();
        }
    }

    @Override
    public boolean purchase(int quantity) {
        if (stockQuantity >= quantity) {
            stockQuantity -= quantity;
            System.out.println("PURCHASE SUCCESS: " + quantity + " units of " + productName + " | " + "Remaining stock: " + stockQuantity);
            return true;
        } else {
            System.out.println("PURCHASE FAILED: " + productName + " is out of stock " + "Available stock: " +stockQuantity);
            return false;
        }
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}

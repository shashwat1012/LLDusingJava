package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }
    @Override
    public void remove(NotificationAlertObserver observer){
        observerList.remove(observer);
    }
    @Override
    public void NotifySubscribers() {
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }
    public void setStockCount(int newStockadded) {
        int prevStock = stockCount;
        stockCount += newStockadded;
        if (prevStock == 0 && stockCount > 0) {
            NotifySubscribers();
        }
    }
    public int getStockCount() {
        return stockCount;
    }
}
package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void NotifySubscribers();
    public void setStockCount(int newStockadded);
    public int getStockCount(); 
}

package ObserverPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplprice;
    private double googPrice;


    public StockGrabber(){

        observers = new ArrayList<>();
    }
    @Override
    public void register(Observer newObserver) {

        observers.add(newObserver);

    }

    @Override
    public void unregister(Observer deleteObserver) {

        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("");

    }

    @Override
    public void notifyObserver() {

    }
}

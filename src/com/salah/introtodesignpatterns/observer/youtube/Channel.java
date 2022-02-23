package com.salah.introtodesignpatterns.observer.youtube;

import java.util.ArrayList;

public class Channel implements Subject {
    private ArrayList<Observer> observers;
    private String channelName;
    private String status;

    public Channel() {
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }


}

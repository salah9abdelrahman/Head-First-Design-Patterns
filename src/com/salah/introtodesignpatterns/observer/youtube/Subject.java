package com.salah.introtodesignpatterns.observer.youtube;


public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

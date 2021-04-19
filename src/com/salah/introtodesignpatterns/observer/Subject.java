package com.salah.introtodesignpatterns.observer;

/**
 * Observable interface
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}

package com.salah.introtodesignpatterns.observer.weather;

import com.salah.introtodesignpatterns.observer.weather.Observer;

/**
 * Observable interface
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}

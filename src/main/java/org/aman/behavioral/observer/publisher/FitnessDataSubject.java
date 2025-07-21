package org.aman.behavioral.observer.publisher;

import org.aman.behavioral.observer.subscriber.FitnessDataObserver;

import java.util.Observer;

public interface FitnessDataSubject {
    void registerObserver(FitnessDataObserver observer);
    void removeObserver(FitnessDataObserver observer);
    void notifyObservers();
}

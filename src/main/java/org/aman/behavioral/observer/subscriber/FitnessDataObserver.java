package org.aman.behavioral.observer.subscriber;

import org.aman.behavioral.observer.publisher.FitnessData;

public interface FitnessDataObserver {
    void update(FitnessData data);
}

package org.aman.behavioral.observer.subscriber;

import org.aman.behavioral.observer.publisher.FitnessData;

public class ProcessLogger implements FitnessDataObserver{
    @Override
    public void update(FitnessData data) {
        System.out.println("Logger saving to DB: steps = "+data.getSteps()+
                ", Active Minutes= "+data.getActiveMinutes()+
                ", Calories= "+data.getCalories());
    }
}

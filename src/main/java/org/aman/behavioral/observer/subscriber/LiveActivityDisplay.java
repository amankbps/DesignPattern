package org.aman.behavioral.observer.subscriber;

import org.aman.behavioral.observer.publisher.FitnessData;

public class LiveActivityDisplay implements FitnessDataObserver{
    @Override
    public void update(FitnessData data) {
        System.out.println("Live Display--->: "+data.getSteps()+
                " | Active Minutes: "+data.getActiveMinutes()+
        " | Calories: "+data.getCalories());
    }
}

package org.aman.behavioral.observer;

import org.aman.behavioral.observer.publisher.FitnessData;
import org.aman.behavioral.observer.subscriber.GoalNotifier;
import org.aman.behavioral.observer.subscriber.LiveActivityDisplay;
import org.aman.behavioral.observer.subscriber.ProcessLogger;

public class Main {
    public static void main(String[] args) {
        FitnessData fitnessData = new FitnessData();
        LiveActivityDisplay liveActivityDisplay = new LiveActivityDisplay();
        GoalNotifier goalNotifier = new GoalNotifier();
        ProcessLogger processLogger = new ProcessLogger();

        //register observers
        fitnessData.registerObserver(liveActivityDisplay);
        fitnessData.registerObserver(goalNotifier);
        fitnessData.registerObserver(processLogger);

        //simulate update
        fitnessData.newFitnessDataPushed(500,5,20);
        fitnessData.newFitnessDataPushed(1500,85,200);
        fitnessData.newFitnessDataPushed(90000,45,900);

        goalNotifier.reset();


    }
}

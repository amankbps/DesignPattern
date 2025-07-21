package org.aman.behavioral.observer.subscriber;

import org.aman.behavioral.observer.publisher.FitnessData;

public class GoalNotifier implements FitnessDataObserver{
    private final int stepGoal=10000;
    private boolean goalReached=false;
    @Override
    public void update(FitnessData data) {

        if(data.getSteps()>=stepGoal && !goalReached){
            System.out.println("Notifier --> Goal Reached! you hit "+data.getSteps()+" steps!");
            goalReached=true;
        }

    }
    public void reset(){
        goalReached=false;
    }
}

package org.aman.creational.prototype.copyconstructor;

public class Engine {
    private int horsePower;

    //constructor
    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    //copy constructor for deep copy
    public Engine(Engine engine) {
        this.horsePower = engine.horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    @Override
    public String toString() {
        return "Engine [horsePower=" + horsePower + "]";
    }
}

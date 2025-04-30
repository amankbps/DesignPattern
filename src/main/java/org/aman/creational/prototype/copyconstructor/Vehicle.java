package org.aman.creational.prototype.copyconstructor;

public class Vehicle {
    private String brand;
    private String model;
    private Engine engine;

    //constructor
    public Vehicle(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    //copy constructor for deep copy
    public Vehicle(Vehicle vehicle)
    {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.engine = new Engine(vehicle.engine);//deep copy of engine
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void showDetails()
    {
        System.out.println("Brand: " + brand+", Model: " + model
        + ", Engine: " + engine);
    }
}

package org.aman.creational.builder;

public class Main {
    public static void main(String[] args) {
        Car car=Car.Builder.newBuilder().SetNumberOfSeats(10).SetEngine(Engine.HYBRID_ENGINE).build();
        System.out.println(car);
    }
}

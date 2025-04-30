package org.aman.creational.builder;

public class Car {
    private final int numberOfSeats;
    private final Engine engine;
    public Car(Builder builder) {
        this.numberOfSeats = builder.numberOfSeats;
        this.engine = builder.engine;
    }

    @Override
    public String toString() {
        return "Car [numberOfSeats=" + numberOfSeats + ", engine=" + engine + "]";
    }

    public static class Builder {
        private int numberOfSeats;
        private Engine engine;

        public static Builder newBuilder() {
            return new Builder();
        }
        public Builder SetNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }
        public Builder SetEngine(Engine engine) {
            this.engine = engine;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}

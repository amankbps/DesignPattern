package org.aman.creational.prototype.copyconstructor;

public class Main {
    public static void main(String[] args) {

        Vehicle car1=new Vehicle("Toyota","Innove",new Engine(1202));
        car1.showDetails();

        //creating new object by copying other(prototype pattern)
        Vehicle car2=new Vehicle(car1);
        car2.showDetails();

        System.out.println("modifying cloned engine");
        car2.getEngine().setHorsePower(1300);
        car1.showDetails();
        car2.showDetails();
    }
}

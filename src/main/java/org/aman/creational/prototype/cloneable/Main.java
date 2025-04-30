package org.aman.creational.prototype.cloneable;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person person=new Person("Aman",new Address("Delhi","new Delhi"));
        Person clonePerson=person.clone();
        //if we update the address object change will reflect to both instance of person these this is
        //shallow copy not deep copy
        person.getAddress().setCity("old Delhi");
        System.out.println(clonePerson);
    }
}

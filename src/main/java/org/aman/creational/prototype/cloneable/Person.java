package org.aman.creational.prototype.cloneable;

public class Person implements Cloneable{
    private String name;
    private Address address;
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Person [name=" + name + ", address=" +address+ "]";
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        //this will do deep copy of address object
        person.setAddress(person.getAddress().clone());
        return person;
    }

}

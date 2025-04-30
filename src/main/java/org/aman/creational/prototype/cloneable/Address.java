package org.aman.creational.prototype.cloneable;

public class Address implements Cloneable{
    private String state;
    private String city;

    public Address(String state, String city) {
        this.state = state;
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "Address [state=" + state + ", city=" + city + "]";
    }
    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address)super.clone();
    }
}

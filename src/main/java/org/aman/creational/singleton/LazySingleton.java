package org.aman.creational.singleton;

public class LazySingleton {

    private static LazySingleton instance;
    private String name;
    private LazySingleton(String name) {
        this.name = name;
    }
    public static synchronized LazySingleton getInstance(String name) {
        if (instance == null) {
            instance = new LazySingleton(name);
        }
           return instance;
    }

    public void display()
    {

        System.out.println(name + " is displayed");

    }
}

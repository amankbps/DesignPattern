package org.aman;

import org.aman.creational.singleton.LazySingleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
;



        Thread t1=new Thread(()->{
            LazySingleton first=LazySingleton.getInstance("first");
            System.out.println(first);
            first.display();
        });

        t1.start();


        Thread t2=new Thread(()->{
            LazySingleton second=LazySingleton.getInstance("second");
            System.out.println(second);
            second.display();
        });
        t2.start();

    }
}
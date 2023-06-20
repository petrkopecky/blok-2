package org.example;

import pk.Car;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Car car1=new Car("trabant","combi",1960);
       System.out.println(car1.toString());
       car1.setYear(1980);
       System.out.println(car1.toString());

    }
}
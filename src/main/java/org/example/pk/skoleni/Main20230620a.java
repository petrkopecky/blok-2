package org.example.pk.skoleni;

import pk.Car;
import pk.Rectangle;


public class Main20230620a {
    public static void main(String[] args) {
        Car car1 = new Car("trabant", "combi", 1960);
        System.out.println(car1.toString());
        car1.setYear(1980);
        System.out.println(car1.toString());

        Rectangle rectangle = new Rectangle(1, 2);
        double rectangleArea = rectangle.getArea();
        System.out.println("area:" + rectangleArea);


    }
}

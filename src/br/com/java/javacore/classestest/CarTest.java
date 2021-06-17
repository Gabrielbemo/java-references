package br.com.java.javacore.classestest;

import br.com.java.javacore.classes.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "fusca";
        car.licensePlate = "00000";
        car.maximumSpeed = 60f;

        System.out.println(car.model);
        System.out.println(car.licensePlate);
        System.out.println(car.maximumSpeed);
    }
}

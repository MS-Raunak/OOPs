package com.Java8_Interfaces;

import java.util.Scanner;

interface Car{
    void start();
    void stop();
    static void info(){
        System.out.println("Don't driver over 150km/h");
    }
    default void bluetooth(){
        System.out.println("Bluetooth installed for " +
                this.getClass().getSimpleName() + " car");
    }
}

class Alto implements Car{

    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " " +
                "is started");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " " +
                "is stopped");
    }
}

class Audi implements Car{
    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " " +
                "is started");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " " +
                "is stopped");
    }
}

class Benz implements Car{
    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " " +
                "is started");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " " +
                "is stopped");
    }
}

class Driver{
    public void driveCar(Car car){
        car.start();
        car.stop();
        if (car.getClass().getSimpleName().equals("Alto")) {
            car.bluetooth();
        }
        Car.info();
    }
}

class SelectCar{
    Car getCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1. Alto
                2. Audi
                3. Benz
                Select your fav car..""");

        int ch = sc.nextInt();

        switch (ch) {
            case 1 : return new Alto();
            case 2 : return new Audi();
            case 3 : return new Benz();
        }
        return null;
    }
}
public class CarDevelopmentApp {
    public static void main(String[] args) {

        Driver driver = new Driver();
        SelectCar selectCar = new SelectCar();

        Car car = selectCar.getCar();
        if(car == null) {
            System.out.println("Car not available");
            return;
        }

        driver.driveCar(car);


    }
}

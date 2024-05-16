package com.abstractkeyword.realworldexample;

import java.util.Scanner;

abstract class Car{
    abstract void start();
    abstract void accelerate();
    abstract void stop();
}

class Alto extends Car{

    @Override
    void start() {
        System.out.println(this.getClass().getSimpleName()
                + " Start by Key");
    }

    @Override
    void accelerate() {
        System.out.println(this.getClass().getSimpleName()
                + " Start by half clutch");
    }

    @Override
    void stop() {
        System.out.println(this.getClass().getSimpleName()
                + " Stop by Key");
    }
}

class Audi extends Car{

    @Override
    void start() {
        System.out.println(this.getClass().getSimpleName()
                + " Start by Button");
    }

    @Override
    void accelerate() {
        System.out.println(this.getClass().getSimpleName()
                + " Start by full clutch");
    }

    @Override
    void stop() {
        System.out.println(this.getClass().getSimpleName()
                + " Stop by Button");
    }
}

class Benz extends Car{

    @Override
    void start() {
        System.out.println(this.getClass().getSimpleName()
                + " Start by Touch");
    }

    @Override
    void accelerate() {
        System.out.println(this.getClass().getSimpleName()
                + " Start by Automatic Clutch");
    }

    @Override
    void stop() {
        System.out.println(this.getClass().getSimpleName()
                + " Stop by Touch");
    }
}

class CarDevelopment{
    Scanner sc = new Scanner(System.in);
    Car displayCarDetails(){
        System.out.print("""
                1. Alto
                2. Audi
                3. Benz
                Please choose your favourite car..
                """);
        int choose = sc.nextInt();

        switch (choose){
            case 1: return new Alto();
            case 2: return new Audi();
            case 3: return new Benz();
        }

        return null;
    }
}


public class CarDevelopmentApp {
    public static void main(String[] args) {
        CarDevelopment carDevelopment = new CarDevelopment();
        Car car = carDevelopment.displayCarDetails();

        if (car == null){
            System.out.println("Car is not available");
            return;
        }
        car.start();
        car.accelerate();
        car.stop();
    }
}

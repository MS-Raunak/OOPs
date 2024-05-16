package com.upcast;

import java.util.Scanner;

class Car{
    void start() { }
    void accelerator() { }
    void stop() { }
}

class Alto extends Car{
    void start(){
        System.out.println("Key start");
    }
    void accelerator(){
        System.out.println("Half Clutch");
    }
    void stop(){
        System.out.println("Key stop");
    }
}

class Audi extends Car{
    void start(){
        System.out.println("Button start");
    }
    void accelerator(){
        System.out.println("Full Clutch");
    }
    void stop(){
        System.out.println("Button stop");
    }
}

class Benz extends Car{
    void start(){
        System.out.println("Touch start");
    }
    void accelerator(){
        System.out.println("Automatic Clutch");
    }
    void stop(){
        System.out.println("Touch stop");
    }
}

class CarSelector{
    public Car getCar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                1.Alto
                2.Audi
                3.Benz
                Choose Your Car:
                """);
        String car = sc.next();

        switch (car){
            case "alto" : return new Alto();
            case "audi" : return new Audi();
            case "benz" : return new Benz();
        }
        return null;
    }
}


public class CarGameApp {
    public static void main(String[] args) {
        CarSelector carSelector = new CarSelector();
        Car car = carSelector.getCar();

        if (car==null){
            System.out.println("Car not available");
            return;
        }
        car.start();
        car.accelerator();
        car.stop();
    }
}

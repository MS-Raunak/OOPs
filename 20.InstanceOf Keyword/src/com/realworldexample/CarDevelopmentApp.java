package com.realworldexample;

import java.util.Scanner;

interface Car{ }

class Alto implements Car{
    void bluetooth(){
        System.out.println("Boat bluetooth installed for "
        + this.getClass().getSimpleName());
    }
}

class Audi implements Car{
    void bluetooth(){
        System.out.println("Boat bluetooth installed for "
                + this.getClass().getSimpleName());
    }
    void musicPlayer(){
        System.out.println("Boat music player installed for "
                + this.getClass().getSimpleName());
    }
}

class Benz implements Car{
    void musicPlayer(){
        System.out.println("Boat music player installed for "
                + this.getClass().getSimpleName());
    }

    void airBag(){
        System.out.println("Air bag installed for "
                + this.getClass().getSimpleName());
    }
}

class Driver{
    void accessBluetooth(Car car){
        if (car instanceof Alto)
            ((Alto) car).bluetooth();
        if (car instanceof Audi)
            ((Audi) car).bluetooth();
    }

    void accessMusicPlayer(Car car){
        if (car instanceof Audi)
            ((Audi) car).musicPlayer();
        if (car instanceof Benz)
            ((Benz) car).musicPlayer();
    }

    void accessAirBag(Car car){
        if (car instanceof Benz)
            ((Benz) car).airBag();
    }
}

class SelectCar{
    Car getCar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1.Alto
                2.Audi
                3.Benz
                Enter your choice""");
        int ch  = sc.nextInt();

        switch (ch){
            case 1: return new Alto();
            case 2: return new Audi();
            case 3: return new Benz();
        }
        return null;
    }
}
public class CarDevelopmentApp {
    public static void main(String[] args) {
        Driver driver = new Driver();

        SelectCar selectCar = new SelectCar();
        Car car = selectCar.getCar();
        if (car == null) {
            System.out.println("Car not available");
            return;
        }
        driver.accessBluetooth(car);
        driver.accessMusicPlayer(car);
        driver.accessAirBag(car);

    }
}

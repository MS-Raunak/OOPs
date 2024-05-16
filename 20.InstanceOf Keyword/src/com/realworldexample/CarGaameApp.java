package com.realworldexample;

import java.util.Scanner;

interface Carr{
    void start();
    void accelerate();
    void stop();
}

class Altoo implements Carr{

    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " started");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " driven");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " stopped");
    }

    void bluetooth(){
        System.out.println("boat bluetooth installed for " + this.getClass().getSimpleName());
    }
}

class Audii implements Carr{
    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " started");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " driven");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " stopped");
    }

    void bluetooth(){
        System.out.println("boat bluetooth installed for " + this.getClass().getSimpleName());
    }
    void musicPlayer(){
        System.out.println("boat music player installed for " + this.getClass().getSimpleName());
    }
}

class Benzz implements Carr{
    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " started");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " driven");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " stopped");
    }


    void musicPlayer(){
        System.out.println("boat music player installed for " + this.getClass().getSimpleName());
    }
    void airBag(){
        System.out.println("Airbag installed for " + this.getClass().getSimpleName());
    }
}

class CarSelector{
    public Carr getCar(){
        Scanner scc = new Scanner(System.in);
        System.out.println("""
                1. Alto
                2. Audi
                3. Benz
                Select your favourite car>>""");

        int choice = scc.nextInt();

        switch (choice){
            case 1: return new Altoo();
            case 2: return new Audii();
            case 3: return new Benzz();
        }
        return null;
    }
}
class Driverr{
    void drive(Carr car){
        car.start();
        car.accelerate();
        car.stop();

//        Alto alto =((Alto) car);
        if (car instanceof Altoo) ((Altoo) car).bluetooth();
        if (car instanceof Audii) {
            Audii audii = ((Audii) car);
            audii.bluetooth();
            audii.musicPlayer();
        }
        if (car instanceof Benzz){
            Benzz benzz = ((Benzz) car);
            benzz.musicPlayer();
            benzz.airBag();
        }

    }
}

public class CarGaameApp {
    public static void main(String[] args) {
        CarSelector carSelector = new CarSelector();
        Carr car = carSelector.getCar();
        if (car == null){
            System.out.println("Car is not available");
            return;
        }
        Driverr driver = new Driverr();

        driver.drive(car);
    }
}

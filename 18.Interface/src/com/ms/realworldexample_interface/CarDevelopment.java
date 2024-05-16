package com.ms.realworldexample_interface;

import java.util.Scanner;

interface Car{
    void start();
    void accelerate();
    void stop();
}

class Alto implements Car{

    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " is start by key");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " run on half clutch");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " is stop by key");
    }
}

class Audi implements Car{

    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " start by button");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " has full clutch");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " stop by button");
    }
}

class Benz implements Car{

    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName() + " is start by touch");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " run by automatic clutch");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " is stop by touch");
    }
}

class Driver{
    public void driveCar(Car car){
        car.start();
        car.accelerate();
        car.stop();
    }
}
public class CarDevelopment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Driver driver = new Driver();
        System.out.println("""
                Select Car:
                1. Alto
                2.Audi
                3.Benz
                Choose your favourite car:""");

        int ch = sc.nextInt();

        switch (ch) {
            case 1 : driver.driveCar(new Alto()); break;
            case 2: driver.driveCar(new Audi()); break;
            case 3: driver.driveCar(new Benz()); break;
            default:
                System.out.println("Invalid input..please try again!");
        }
    }
}

package com.upcast.cardev;

class Car{
    public void showcase() { }
    public void start(){}
    public void accelerator(){}
    public void stop(){}
}
class Alto extends Car{
    public void showcase(){
        System.out.println("Its a Alto fame..");
    }

    public void start(){
        System.out.println("Key Start");
    }

    public void accelerator(){
        System.out.println("Half Clutch");
    }

    public void stop(){
        System.out.println("Key Stop");
    }
}

class Audi extends Car{
    public void showcase(){
        System.out.println("Its a  Audi swag..");
    }
    public void start(){
        System.out.println("Button Start");
    }

    public void accelerator(){
        System.out.println("Full Clutch");
    }

    public void stop(){
        System.out.println("Button Stop");
    }
}

class Benz extends Car{
    public void showcase(){
        System.out.println("Its a fabulous Benz..");
    }
    public void start(){
        System.out.println("Touch Start");
    }

    public void accelerator(){
        System.out.println("Automatic Clutch");
    }

    public void stop(){
        System.out.println("Touch Stop");
    }
}

class Driver{
    public void drive(Car car){
        car.showcase();
        car.start();
        car.accelerator();
        car.stop();
    }
}

public class CarDev {
    public static void main(String[] args) {
        Driver driver = new Driver();
        //driver.drive(new Alto());
        //driver.drive(new Audi());
        driver.drive(new Benz());


    }
}

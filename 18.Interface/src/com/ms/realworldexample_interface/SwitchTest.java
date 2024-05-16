package com.ms.realworldexample_interface;

import java.util.Scanner;

interface Switch{
    void on();
    void off();
}

class Bulb implements Switch{

    @Override
    public void on() {
        System.out.println(this.getClass().getSimpleName() + " is on");
    }

    @Override
    public void off() {
        System.out.println(this.getClass().getSimpleName() + " is off");
    }
}

class Fan implements Switch{

    @Override
    public void on() {
        System.out.println(this.getClass().getSimpleName() + " is on");
    }

    @Override
    public void off() {
        System.out.println(this.getClass().getSimpleName() + " is off");
    }
}

class User{
    public void useSwitch(Switch s){
        s.on();
        s.off();
    }
}

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = new User();
        System.out.print("""
                1.Bulb
                2.Fan
                Please enter your choice: """);
        int choice = sc.nextInt();

        switch (choice){
            case 1: user.useSwitch(new Bulb()); break;
            case 2: user.useSwitch(new Fan()); break;
            default:
                System.out.println("Invalid input...");
        }
    }
}

package com.upcasting.intro;

class Animal{
    void drinkWater(){
        System.out.println(this.getClass().getSimpleName() + " drink water");
    }
    void sound(){ }
    void movement() { }
}

class Lion extends Animal {
    @Override
    void sound(){
        System.out.println("Lion Roars");
    }

    @Override
    void movement() {
        System.out.println("Lion walks/runs");
    }
}

class Snake extends Animal{
    @Override
    void sound() {
        System.out.println("Snake Hiss");
    }

    @Override
    void movement() {
        System.out.println("Snake Crawls");
    }
}
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.drinkWater();
        animal.sound();
        animal.movement();

        System.out.println("*********************");

        animal = new Snake();
        animal.drinkWater();
        animal.sound();
        animal.movement();
    }
}

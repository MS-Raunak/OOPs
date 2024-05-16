package com.intro.privateconstructor;

class B{
    int i;

    private B(int i){
        this.i = i;
    }

    // Factory method for the instantiation
    public static B getInstance(int i){

        return new B(i);
    }
}
public class TestB {
    public static void main(String[] args) {
        B b1 = B.getInstance(10);
        B b2 = B.getInstance(20);

        System.out.println("i: " + b1.i);
        System.out.println("i: " + b2.i);
    }
}

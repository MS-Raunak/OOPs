package com.ms.realworldexample_interface;

interface Inter{
    int i = 45; // by default public static final
    void m1();  // by deafault public abstract
    public abstract void m2();
}

class B implements Inter {
    @Override
     public void m1(){
        System.out.println("m1() is implemented for B class");
     }

    @Override
    public void m2() {
        System.out.println("m2() is implemented for B class");
    }
}


public class MyInterface {
    public static void main(String[] args) {
        Inter iter = new B();
        iter.m1();
        iter.m2();

        System.out.println(iter.i);
        System.out.println(Inter.i); // Recommended because of static value
    }
}

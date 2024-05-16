package com.upcasting.intro;

class A{
    void m1(){
        System.out.println("A: Generic Method");
    }

    void m2(){
        System.out.println("A: m2()");
    }
}

class B extends A{
    void m2(){
        System.out.println("B: m2()");
    }

    void specificMethod(){
        System.out.println("B: Specific Method");
    }
}
public class TestUpcast {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
        a.m2();
        //a.m3(); // CTE: can't access specific method
    }
}

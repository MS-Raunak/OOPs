package com.Java9_Interfaces;

interface I{

    static void m(){
        System.out.println("General information");
    }

    private void m1(){
        // common code of all default classes
        System.out.println("common code of all default classes");
    }

    default void m2(){
        m1();
    }
    default void m3(){
        m1();
    }
}

class B implements I{

}
public class Java9_InterfaceTest {
    public static void main(String[] args) {
        I i = new B();
        i.m2();
        i.m3();
    }
}

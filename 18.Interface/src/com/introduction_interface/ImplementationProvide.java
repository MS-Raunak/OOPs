/*
   If implementation class does not provide all the implementation then
   declare implementation class as abstract otherwise compiler throw error.
 */


package com.introduction_interface;

interface Myinter3{
    void m1();
    void m2();
}
abstract class B implements Myinter3{
    @Override
    public void m1() {
        System.out.println("m1() overridden");
    }
}

class C extends B{

    @Override
    public void m2() {
        System.out.println("m2() overridden");
    }
}

public class ImplementationProvide {
    public static void main(String[] args) {
       Myinter3 myinter3 = new C();
       myinter3.m1();
       myinter3.m2();
    }
}

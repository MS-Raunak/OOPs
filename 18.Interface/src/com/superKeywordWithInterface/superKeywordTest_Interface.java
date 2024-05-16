package com.superKeywordWithInterface;


interface I1{
    int i = 10;
    default void m1(){
        System.out.println("m1() of I1");
    }
}

interface I2{
    int j = 50;
    default void m2(){
        System.out.println("m2() of I2");
    }
}

class B implements I1,I2{
   @Override
    public void m1(){
       I1.super.m1();
       I2.super.m2();
    }
}
public class superKeywordTest_Interface {
    public static void main(String[] args) {
        I1 i1 = new B();
        i1.m1();
    }
}

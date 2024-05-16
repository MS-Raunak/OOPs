package com.assignment.interfac;

/*
multiple inheritance with same method with same
arguments can be implemented at most once
 */


interface I1{
    void m();
}
interface I2{
    void m();
}
 class C implements I1,I2{

     @Override
     public void m() {
         System.out.println("m() of I1 interface");
     }
 }

public class MyInterface2 {
    public static void main(String[] args) {
        C c = new C();
    }
}

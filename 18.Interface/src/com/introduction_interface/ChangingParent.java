package com.introduction_interface;
interface Inter{
    void m1();
    void m2();
}

class MyInter implements Inter{

    @Override
    public void m1() {
        System.out.println("m1() overridden");
    }

    @Override
    public void m2() {
        System.out.println("m2() overridden");
    }
}
public class ChangingParent {
    public static void main(String[] args) {
        Object obj = new MyInter();
        // changing parent
        Inter inter = (Inter) obj;
        inter.m1();
        inter.m2();
    }
}

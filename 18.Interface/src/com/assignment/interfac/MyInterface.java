package com.assignment.interfac;

interface Interface1{
    int a=10;
    void m1();
}

interface Interface2{
    int b = 12;
    void m2();
}

class B implements Interface1,Interface2{

    @Override
    public void m1() {
        System.out.println("m1() of Interface1 implemented in B");
    }

    @Override
    public void m2() {
        System.out.println("m2() of Interface2 implemented in B");
    }
}

public interface MyInterface {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m2();

        System.out.println(Interface1.a);
        System.out.println(Interface2.b);
    }
}

package com.assignment.interfac;

interface Myinterface1{
    void m1(int i);
}

interface Myinterface2{
    void m1(String s);
}

class Myclass implements Myinterface1, Myinterface2{

    @Override
    public void m1(int i) {
        System.out.println(i);
    }

    @Override
    public void m1(String s) {
        System.out.println(s);
    }
}
public class MultipleInterTest {
    public static void main(String[] args) {
        Myclass m = new Myclass();
        m.m1(10);
        m.m1("hahahaha");
    }
}

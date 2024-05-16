package com.Java8_Interfaces;

interface Ijava_8version{
    int i=10;
    static void sm(){
        System.out.println("Common features for all the classes");
    }
    default void m(){
        System.out.println("Default implementation for " +
                this.getClass().getSimpleName() + " class");
    }
}

class B implements Ijava_8version{}
class C implements Ijava_8version{
    @Override
    public void m() {
        System.out.println("Default method overridden");
    }
}

public class InterfaceTestJava8 {
    public static void main(String[] args) {
        Ijava_8version i = new B();
        i.m();

        Ijava_8version i2 = new C();
        i2.m();

        Ijava_8version.sm();

    }
}

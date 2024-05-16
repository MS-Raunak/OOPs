package com.introduction_interface;

interface I1 {
    void m1();
    void m2();
}

interface I2 extends I1{
    void m3();
}

class I implements I1,I2{

    @Override
    public void m1() {
        System.out.println("m1() overridden");
    }

    @Override
    public void m2() {
        System.out.println("m2() overridden");
    }
    @Override
    public void m3() {
        System.out.println("m3() overridden");
    }

}
public class MultipleInterfaceTest {
    public static void main(String[] args) {

        I2 i2 = new I();
        i2.m1();
        i2.m2();
        i2.m3();

    }
}

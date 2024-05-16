/*
* Abstract can contain constructor within itself.
* called by call by super() from subclass
 */

package com.abstractkeyword.intro;

abstract class A1{
    int i;

    A1(int i){
        this.i = i;
    }
    abstract void display();
}

class B1 extends A1{

    B1(int i){
        super(i);
    }

    @Override
    void display() {
        System.out.println("i : " + i);
    }
}

public class AbstractConstructorTest {
    public static void main(String[] args) {
        B1 b1 = new B1(10);
        b1.display();

    }
}

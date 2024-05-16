/*
* Abstract class & methods:
* ========================
* A class which is prefixed with abstract keyword is known as Abstract class.
* It can't instantiate.
* It is an incomplete class.
* Abstract class either can contain both concrete method and abstract method or only concrete or only abstract method.
* Constructor can contain inside abstract class.
*
*
* A method with abstract keyword/modifier is known as Abstract Method.
* It has no method body so its has no implementation as well.
* It is always ended with semicolon.
* It is mandatory to provide implementation to abstract method in subclass
* or, overriding is compulsory in the case of abstract method.
*
* Limitation(Illegal Modifiers):
* 1) final abstract void m1() : cant use it
* 2) private abstract void m1() : can't use
* 3) static abstract void m1() : can't use
*
 */


package com.abstractkeyword.intro;

abstract class A{
    abstract void m1();
    abstract void m2();
}

class B extends A{
    void m1(){
        System.out.println("m1() of A class implemented");
    }
    void m2(){
        System.out.println("m2() of A class implemented");
    }
}


public class AbstractTest {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m2();
    }
}

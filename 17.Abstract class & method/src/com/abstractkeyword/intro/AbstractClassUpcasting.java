/*
* we cant upcast the subclass object in the reference of abstract class,
* but we can't create the object for abstract class.
 */

package com.abstractkeyword.intro;

abstract class A2{
    abstract void m1();
    abstract void m2();
    void m4() {
        System.out.println("m4() of A and it is accessible by all the class's reference");
    }
}

abstract class B2 extends A2{
    abstract void m3();
}

class C extends B2{
    void m1(){
        System.out.println("m1() of A2 class implemented in C class");
    }
    void m2(){
        System.out.println("m2() of A2 class is implemented in C class");
    }
    void m3(){
        System.out.println("m3() of B2 class is implemented in C class and it" +
                "it is not accessible by A class Reference");
    }

    void m5(){
        System.out.println("m5() of C and it is not accessible by A and B class Reference");
    }
}



public class AbstractClassUpcasting {
    public static void main(String[] args) {
        A2 a2;
        a2 = new C();
        a2.m1();
        a2.m2();
        a2.m4();
        // a2.m3() // It is specific method of B.

        System.out.println("**********************");
        B2 b2 = new C();
        b2.m1();
        b2.m2();
        b2.m3();
        b2.m4();
       // b2.m5(); // Specific method of C.

        System.out.println("**********************");
        C c = new C();
        c.m1();
        c.m2();
        c.m3();
        c.m4();
        c.m5();

        System.out.println("**********************");

        a2 = new C();
        a2.m1();
        a2.m2();
        //a2.m3(); // Specific for B class
        a2.m4();
        //a2.m5(); // Specific for C class
    }
}

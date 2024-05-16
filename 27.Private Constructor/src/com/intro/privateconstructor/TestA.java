/*
* Whenever we declare constructor as private access modifier
  then we can't able to create object in other class
* Object will be created in same class and by using factory method
   we can access to another class.

* Factory method means,
* It should be non-private access modifier
  (most of the time it should be public)
* It should be static modifier
* It should be same class as returnType.
* It will return object.
 */


package com.intro.privateconstructor;

class A{
    int i;
    private A( ) {
        System.out.println("Private Constructor");
    }

    // Factory method for object creation
    public static A getInstance() {
        return new A();
    }
}

public class TestA {
    public static void main(String[] args) {
        A a1 = A.getInstance();
        System.out.println("Value of = " + a1.i);  // 0
    }
}


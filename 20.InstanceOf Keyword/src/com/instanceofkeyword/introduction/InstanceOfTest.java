package com.instanceofkeyword.introduction;

class A{ }
class B extends A{ }
class C{ }
public class InstanceOfTest {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj instanceof Object); // true
        System.out.println(obj instanceof A); // false
        System.out.println(obj instanceof B); // false

        System.out.println("\n\n2.*********************\n");
        A a = new A();
        System.out.println(a instanceof Object); // true
        System.out.println(a instanceof A); // true
        System.out.println(a instanceof B); // false

        System.out.println("\n\n3.*********************\n");

        B b = new B();
        System.out.println(b instanceof Object);
        System.out.println(b instanceof A);
        System.out.println(b instanceof B);

        System.out.println("\n\n4.*********************\n");

        A a1 = new B();
        System.out.println(a1 instanceof Object);
        System.out.println(a1 instanceof A);
        System.out.println(a1 instanceof B);

        System.out.println("\n\n5*********************\n");

        C c = new C();
        System.out.println(c instanceof Object);
       // System.out.println(c instanceof A); //has no relationship so will throw CTE
    }
}

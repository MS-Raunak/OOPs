/*
 Creating an object of subclass have same address in all the class
 for 'this' keyword.
 */

class A{
    void m1(){
        System.out.println(this);
    }
}

class B extends A{
    void m2(){
        System.out.println(this);
    }
}

public class CheckAddress {
    public static void main(String[] args) {

        B b = new B();
        System.out.println(b);
        b.m2();
        b.m1();

    }
}

/*
* Marker interface used to provide some special instruction to jvm
* An empty interface is known as Marker interface.
* Also known as TAG interface
*
 */

interface Interface2{
    // empty
}
class A implements Interface2{
    void m1(){  // specific method for Interface2 reference
        System.out.println("m1() of A class");
    }
}
public class BasicExample {
    public static void main(String[] args) {
        Interface2 i = new A();
        A a = (A) i; // down-casting
        a.m1();

        ((A)i).m1();  // shortcut down-casting

    }
}

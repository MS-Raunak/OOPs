/*
-static properties and constructor can't participate in
inheritance because it's associated with class directly.

-Syntactically it's correct with static.
 */

class A{
    static {   // First execute
        System.out.println("Static Block of class A");
    }

    {   // 3rd execute
        System.out.println("Non-static block of class A");
    }
}

class B extends A{
    static { // Second execute
        System.out.println("Static Block of class B");
    }

    { //  4th execute
        System.out.println("Non-static block of class B");
    }
}
public class StaticMain {
    public static void main(String[] args) {
        new B();
    }
}

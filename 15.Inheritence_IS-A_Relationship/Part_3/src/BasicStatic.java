/*
static properties and constructor can't participate in
inheritance because it's associated with class directly.

-Syntactically it's correct with static.
 */

class P{
    static int i=10;
    static void m1(){
        System.out.println("Static memeber of class A");
    }
}

class Q extends P{
}

public class BasicStatic {
    public static void main(String[] args) {

        System.out.println(P.i);
        System.out.println(Q.i);

        P p = new P();
        System.out.println(p.i);

        Q q = new Q();
        System.out.println(q.i);

        P.m1();
        Q.m1();

        p.m1();
        q.m1();
    }
}

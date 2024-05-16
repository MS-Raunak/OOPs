
interface I{
    default void m1(){
        System.out.println("m1() generic");
    }
}

class B2 implements I{
    void m2(){
        System.out.println("m2() specific");
    }
}

public class DowncastingForInterface {
    public static void main(String[] args) {
        // Upcasting
        I i = new B2();
        i.m1();
       // i.m2() // Specific method

        // Down casting
        B2 b = (B2) i;
        b.m1();
        b.m2(); // specific accessible
        // shortcut
        ((B2) i).m2(); // specific accessible
    }
}

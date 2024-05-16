

interface I1{
    void m1();
    default void m2(){
        System.out.println("m2()-default");
        m3();
    }
    private void m3(){
        System.out.println("m3()-private");
    }
    static void m4(){
        System.out.println("m4()-static");
    }
}

class B implements I1{

    @Override
    public void m1() {
        System.out.println("m1() implemented in B class.");
    }

}

public class functionalInterfaceTest {
    public static void main(String[] args) {
        I1 i1 = new B();
        i1.m1();
        i1.m2();
       I1.m4();
    }
}

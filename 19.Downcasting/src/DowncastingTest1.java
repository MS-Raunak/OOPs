class A1{}
class B1 extends A1{}
class C1 extends A1{}

public class DowncastingTest1 {
    public static void main(String[] args) {
        A1 a1 = new B1();
        //C1 c1 = (C1) a1;  // ClassCastException

        B1 b1 = (B1) a1;
    }
}

/*
In above commented code upcasted to the B object and trying to downcast to the
C object that is not possible
 */

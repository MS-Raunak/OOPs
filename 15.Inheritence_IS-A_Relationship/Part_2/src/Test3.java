class A3{
    void m1(){
        System.out.println("m1() of A3");// first executed
    }
}

class B3 extends A3{
    void m1(){
        super.m1();  // second  call
        System.out.println("m1() of B3"); // 2nd executed
    }
}
public class Test3 {
    public static void main(String[] args) {
        B3 b3 = new B3();
        b3.m1(); // first call
    }
}

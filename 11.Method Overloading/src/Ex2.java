
// on the basis of type

class B{
    void m(int n){
        System.out.println("Int type");
    }
    void m(double d){
        System.out.println("Double type");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        B b = new B();
        b.m(10);
        b.m(5.9);
    }
}

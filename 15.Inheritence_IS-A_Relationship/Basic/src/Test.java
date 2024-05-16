class A{
    int i;
}

class B extends A{
    int j;
}
public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.i=45;
        b.j=50;

        System.out.println(b.i);
        System.out.println(b.j);
    }
}

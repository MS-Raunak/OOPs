class A{
    int i=15;
    void m1(){
        System.out.println(i); // third call i=15
    }
}
class B extends A{
    int i=45;
    int j=20;
    void m2(){
        System.out.println(i); // 4th call i=45
        System.out.println(j); // 5th call j=20
    }
}
public class Test1 {
    public static void main(String[] args) {

        B b = new B();

        System.out.println(b.i); // first call i=45
        System.out.println(b.j); // second call j=20
        b.m1();
        b.m2();
    }
}

/*
45
20
15
45
20
 */
/*
 *A functional interface can contain at most one abstract method.
 * n Number of concrete can contain including static,private,default methods.
 * Used to perform single task.
 */

@FunctionalInterface
interface Interface1{
    void m1();
    //void m2();  Error
}

class C implements Interface1{

    @Override
    public void m1() {
        System.out.println("m1 implemented");
    }
}
public class BasicExample {
    public static void main(String[] args) {
        Interface1 i = new C();
        i.m1();
    }
}

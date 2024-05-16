package ms.singletonclass;

/*
 * Singleton means, A class which can produce at most one object
 * We can achieve single ton by using early instantiation or lazy instantiation
 * initialization must be static type
 */
class A{
    private static A instance = new A();
    int i =10;
    private A(){
        ++i;
        System.out.println("Singleton class");
        System.out.println(i);
    }

    public static A getInstance(){
        return instance;
    }
}
public class TestSingletonA {
    public static void main(String[] args) {
        A a1 = A.getInstance();
        System.out.println(a1.i);
        A a2 = A.getInstance();
        System.out.println(a2.i);
        A a3 = A.getInstance();
        System.out.println(a3.i);
    }
}

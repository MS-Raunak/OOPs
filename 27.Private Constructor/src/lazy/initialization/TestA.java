package lazy.initialization;

class A{
   private static A instance;  // lazy initialization

    private A(){
        System.out.println("Private Constructor");
    }

    // Factory method : to create object for the other class
    public static A getInstance(){
        instance = new A();
        return instance;
    }
}
public class TestA {
    public static void main(String[] args) {
        A a1 = A.getInstance();
        A a2 = A.getInstance();

        System.out.println(a1.equals(a2)); // false
    }
}

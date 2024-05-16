/*
Early initialization  means, a class is initiated for the future use
* It should be the class type variable or reference
* Factory method is mandatory to create & produce object to other class
 */

package early_initialization.pack1;

class A{
    static A instance = new A();    // early initialization for future use
    int i;


    private A(){
        System.out.println("Private Constructor");
    }

    // Factory method : creating & producing obj to the other classes
    public static A getInstance(){
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



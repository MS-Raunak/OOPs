
class A{}
class B extends A{}
class c extends B{}

public class DownCastingTest {
    public static void main(String[] args) {
        A a = new A();
        B b = (B) a; // ClassCastException
    }
}

/*
To achieve Down casting upcasting is mandatory otherwise will get runTime exception
 */
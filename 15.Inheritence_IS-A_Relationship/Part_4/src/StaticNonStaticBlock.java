class A{
    // static block : memory allocation during class loading
    static {
        System.out.println("1-execution");
    }

    //non-static block: during obj creation
    {
        System.out.println("3-execution");
    }


    // constructor : during constructor call
    A(){
        System.out.println("4-execution");
    }
}
class B extends A{
    //static block : memory allocation during class loading
    static {
        System.out.println("2-execution");
    }

    //Non-static block: during obj creation
    {
        System.out.println("5-execution");
    }



    //constructor: during constructor call
    B(){
        System.out.println("6-execution");
    }
}

public class StaticNonStaticBlock {
    public static void main(String[] args) {
        new B();
    }
}

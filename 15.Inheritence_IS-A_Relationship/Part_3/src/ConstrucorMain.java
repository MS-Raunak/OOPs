/*
Every class has default constructor which is internally created by JDK.
-The constructor always call to the super class constructor

static properties and constructor can't participate in
inheritance because it's associated with class directly.

-Syntactically it's correct with static.
 */
class A1{
    A1(){
        System.out.println("Class A1 Default Constructor");
    }
}

class B1 extends A1{
    B1(){
        //super();
        System.out.println("Class B1 Default Constructor");
    }
    B1(int i){
//        super();
        System.out.println("Class B1 parametrized Constructor");
    }
}
public class ConstrucorMain {
    public static void main(String[] args) {
        new B1(10);
    }
}

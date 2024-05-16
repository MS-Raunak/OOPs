/*
-Private properties of super class can't access by using
subclass objects.
-even same class object reference can't access to the private properties
of same class
 */

class Parent{
    private int i=10;
    private void wealth(){
        System.out.println("Parent doesn't want to allow access to their Child");
    }
}

class Child extends Parent{
    void behaviour(){
        System.out.println("Child behaviour is not good");
    }
}
public class ParentMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.behaviour();
        //child.wealth();  // sub class can't access private properties of super class

        Parent parent = new Parent();


    }
}

/*
* We know that every class has default constructor and
  every default constructor has default super class call

* when we externally create a parameterized constructor in super
  class then super call of subclass constructor is not possible
   to parameterized constructor,
   and it will throw error.

 */

class Base{
    Base(){
        System.out.println("Base class default constructor");
    }


    Base(int n){
        System.out.println("Base class parameterized constructor");
    }

}

class Derived extends Base{
    Derived(int m){
        //super(); //by default-will call always call to default constructor
        super(8); // explicitly defined
        System.out.println("Derived class constructor");
    }
}
public class ConstructorWithSuper {
    public static void main(String[] args) {
        new Derived(9);
    }
}

class SuperClass{
    SuperClass(){
        this(9);
        System.out.println("No-arg SuperClass constructor: executed:3"); // execution:3
    }
    SuperClass(int n){
        this(10,20);
        System.out.println("DerviedClass 2-arg Constructor: executed:2 "); // execution:2
    }
    SuperClass(int n, int m){
        System.out.println("DerviedClass 3-arg Constructor: executed:1 ");  // execution:1
    }

}
class DerivedClass extends SuperClass{
    DerivedClass(){
        System.out.println("DerviedClass no-arg Constructor: executed:4 "); // execution:4
    }
    DerivedClass(int n){
        this();
        System.out.println("DerviedClass 1-arg Constructor: executed:5 ");// execution:5
    }
    DerivedClass(int n, int m){
        this(n);
        System.out.println("DerviedClass 2-arg Constructor: executed:6 ");// execution:6
    }
}

public class CallToThis_CallToSuper {
    public static void main(String[] args) {
         new DerivedClass(5,4);
    }
}
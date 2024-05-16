class A{
    A(){
        System.out.println("Default Constructor");
    }
    A(int n){
        this();
        System.out.println("1- Parameter Constructor");
    }
    A(int n, int m){
        this(2);
        System.out.println("2-parameter Constructor");
    }
}

public class BasicMain {
    public static void main(String[] args) {
        A a = new A(25,46);
    }
}

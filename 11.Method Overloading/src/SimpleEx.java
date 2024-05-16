// On the basis of length of arguments

class A{
    void  m(int n){
        System.out.println(n+n);
    }
    void  m(int m, int n){
        System.out.println(m+n);
    }
}

public class SimpleEx {
    public static void main(String[] args) {
        A a = new A();
        a.m(2);
        a.m(3,5);
    }
}

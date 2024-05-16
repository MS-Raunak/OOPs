// Program Resolution or order of execution

class A1{
    int i=45;
}
//
class B1 extends A1{
    int i=50;
    void show(){
        int i=100;
        System.out.println(i); // 2nd executed i=100
        System.out.println(this.i); // 3rd executed i=50
        System.out.println(super.i); // 4t executed i = 45
    }
}

public class Test {
    public static void main(String[] args) {
        B1 b1 = new B1();
        System.out.println(b1.i); // 1st executed i=50
        b1.show();
    }
}
/*
50
100
50
45
 */
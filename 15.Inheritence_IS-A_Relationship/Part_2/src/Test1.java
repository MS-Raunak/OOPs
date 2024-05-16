
// Program Resolution or order of execution

class A2{
    int i=45;
}
//
class B2 extends A2{
    void show(){
        System.out.println(i); // 2nd executed i=45
        System.out.println(this.i); // 3rd executed i=45
        System.out.println(super.i); // 4t executed i = 45
    }
}

public class Test1 {
    public static void main(String[] args) {
        B2 b2 = new B2();
        System.out.println(b2.i); // 1st executed i=45
        b2.show();
    }
}
/*
50
100
50
45
 */
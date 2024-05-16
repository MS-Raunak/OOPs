
class C{
    void m(int i, double d){
        System.out.println("Int,Double");
    }
    void m(double d, int i){
        System.out.println("Double, Int");
    }
}
public class Ex3 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m(10,30.8);
//        c1.m(10, 10); Can't pass the same value if two method have different value
        /*
        It will through compileTime Error
         */

    }
}

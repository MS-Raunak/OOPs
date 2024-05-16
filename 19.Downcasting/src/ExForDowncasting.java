
class AA{
    void m1(){
        System.out.println("m1() method of AA");
    }
}

class BB extends AA{
    void m2(){
        System.out.println("Specified method");
    }
}

public class ExForDowncasting {
    public static void main(String[] args) {
//        Upcasting: cant access specific method
        AA a = new BB();
        a.m1();
        //a2.m2() // Specific method not accessible


//        Down casting: can access specific method as well as generic and overriding method
        BB b = (BB) a;
        b.m1();
        b.m2();
        //if there is a single method to call then use shortcut down casting
        ((BB)a).m2();

    }
}

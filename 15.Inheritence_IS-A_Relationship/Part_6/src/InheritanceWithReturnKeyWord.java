class A{
    int i=10;
    int show(){
        return i;
    }
}
class B extends A{
    int i=20;

    int show(){
        return i;
    }
    int display(){
        return super.show();
    }
}

class C extends B{
    int i=30;
    void dis(){
        System.out.println(display());
        System.out.println(show());
        System.out.println(i);
    }
}

public class InheritanceWithReturnKeyWord {
    public static void main(String[] args) {
        C c= new C();
        c.dis();

    }
}

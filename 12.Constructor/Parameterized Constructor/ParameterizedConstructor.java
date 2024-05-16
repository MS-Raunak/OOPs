class A{
    int i;
    A(int i){
        i=10;  /* initially i=20 then 10 reinitialized */
       this.i = i;

    }
    void show(){
        System.out.println(i);
    }

}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        A a = new A(20);
        a.show();
    }
}

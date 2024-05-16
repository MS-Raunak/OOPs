class Rectangle{
    Rectangle(int length, int breadth){
        System.out.println("Area:" + length*breadth);
    }
    Rectangle(int n){
        this(n,n);
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,7);
        Rectangle rectangle1 = new Rectangle(10);
    }
}

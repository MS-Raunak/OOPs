class Rectangle1{
    int length;
    int breadth;

    static int objectNum=0;

    Rectangle1(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    Rectangle1(int num){
        this(num,num);
    }

    void findAreaOfRectangle(){
        objectNum++;
        System.out.println("Area of Rectangle " + objectNum + ": " + length*breadth);
    }

}
public class Rectangle_ConstructorChain {
    public static void main(String[] args) {
        Rectangle1 rectangle = new Rectangle1(5,7);
        rectangle.findAreaOfRectangle();
        Rectangle1 rectangle1 = new Rectangle1(10);
        rectangle1.findAreaOfRectangle();
    }
}

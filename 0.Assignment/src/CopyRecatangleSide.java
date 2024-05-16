class Rectangle{
    int length;
    int width;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    void showSideOfRectangle(){
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
    }
    void showAreaOfRectangle(){
        System.out.println("Area Of Rectangle : " +length*width);
        System.out.println("******************************");
    }

}
public class CopyRecatangleSide {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,7);
        r1.showSideOfRectangle();
        r1.showAreaOfRectangle();
        Rectangle r2 = new Rectangle(8, r1.width);
        r2.showSideOfRectangle();
        r2.showAreaOfRectangle();
        Rectangle r3 = new Rectangle(r2.length, 9);
        r3.showSideOfRectangle();
        r3.showAreaOfRectangle();
    }
}

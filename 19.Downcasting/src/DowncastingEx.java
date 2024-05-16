
class AB{
    int i=100;
}

class BC extends AB{
    int i=200;
}

public class DowncastingEx {
    public static void main(String[] args) {
        AB ab = new BC();
        System.out.println(ab.i);  // 100

        // Downcasting
        System.out.println( ((BC)ab).i); // 200
    }
}

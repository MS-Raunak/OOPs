import java.util.Scanner;

interface Washable{ }

class Car implements Washable{ }
class Bike implements Washable{ }
class Mobile { }
class Laptop { }

class Wasserman {
    // Wash
  public void wash(Object obj){
      if (obj instanceof Washable) {
          System.out.println(obj.getClass().getSimpleName() + " is Washable");
          return;
      }
      System.out.println(obj.getClass().getSimpleName() + " is not Washable");
  }
}

public class RealWorldExample {
    public static void main(String[] args) {
        Wasserman washerman = new Wasserman();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Car\n2.Bike\n3.Mobile\n4.Laptop\nSelect object..");
        int choice = sc.nextInt();
        switch (choice){
            case 1: washerman.wash(new Car()); break;
            case 2: washerman.wash(new Bike()); break;
            case 3: washerman.wash(new Mobile()); break;
            case 4: washerman.wash(new Laptop()); break;
            default:
                System.out.println("Invalid input");
        }
    }
}

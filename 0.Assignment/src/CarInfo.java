import java.util.Scanner;

class Car{
    int carno;
    String carName;
    double carPrice;
/*
    static int cNo=100;
//    Non-static block
    {
        carno=cNo;
        cNo++;
    }

 */


    Car(int carno, String carName, double carPrice){
        this.carno = carno;
        this.carName = carName;
        this.carPrice = carPrice;
    }
    void displayCar(){
        System.out.println("Car ID: "+carno);
        System.out.println("Car Name: " + carName);
        System.out.println("Car Price: " + carPrice);
        System.out.println("************************");
    }
}

class CarFactory{   // Factory
    public static Car createCar(){ // Factory method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car Id:");
        int id = sc.nextInt();
        System.out.print("Enter Car Name:");
        String cName = sc.next();
        System.out.print("Enter Car Price:");
        double cPrice = sc.nextDouble();

        Car car  = new Car(id, cName,cPrice);
        return car;
    }
}
public class CarInfo {
    public static void main(String[] args) {
        Car car1 = CarFactory.createCar();
        car1.displayCar();

        Car car2 = CarFactory.createCar();
        car2.displayCar();
    }
}

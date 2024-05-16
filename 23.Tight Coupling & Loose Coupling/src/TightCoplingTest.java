/*
Service provide code and end user code connected in such
a way, the implementation changes of service provider code
affect to the end user code
 */

import java.util.Scanner;

class Sim{
    void insert(){
        System.out.println("Sim Inserted");
    }
}
class Airtel extends Sim{

    void call(){
        System.out.println(this.getClass().getSimpleName()
                + " call connected");
    }
}

class Jio extends Sim{

    void call(){
        System.out.println(this.getClass().getSimpleName()
                + " call connected");
    }
}

class Phone{
    Sim sim;
    Phone(Sim sim){
        this.sim = sim;
    }

    public void fetchCalling(){
        sim.insert();
        if(sim instanceof Airtel) {
            Airtel airtel = (Airtel) sim;
            airtel.call();
        } else if (sim instanceof Jio) {
            Jio jio = (Jio) sim;
            jio.call();
        }
    }
}

public class TightCoplingTest {
    public static void main(String[] args) {

        Phone phone = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Airtel\n2.Jio\nChoose sim..");
        int ch = scanner.nextInt();
        switch (ch){
            case 1: phone = new Phone(new Airtel()); break;
            case 2: phone = new Phone(new Jio()); break;
            default:
                System.out.println("Invalid choice");
        }
        phone.fetchCalling();
    }
}

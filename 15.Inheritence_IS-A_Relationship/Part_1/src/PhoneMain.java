class Phone{
    void call(){
        System.out.println("Call Connected, Speaking..");
    }
}

class CameraPhone extends Phone{
    void takePhoto(){
        System.out.println("Photo Clicked..");
    }
}
class SmartPhone extends CameraPhone{
    void installApps(){
        System.out.println("App installed..");
    }
}

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone = new Phone();
        CameraPhone cameraPhone = new CameraPhone();
        SmartPhone smartPhone = new SmartPhone();

        phone.call();

        System.out.println("*********************");

        cameraPhone.call();   // Accessing features of their super class
        cameraPhone.takePhoto();

        System.out.println("*********************");

        smartPhone.call(); // Accessing features of their super class
        smartPhone.takePhoto(); // Accessing features of their super class
        smartPhone.installApps();

    }
}

class Human{
    String name;
    int age;
    String gender;

    Human(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}

class Doctor extends Human{
    String specialist;

    Doctor(String name, int age, String gender,String specialist){
        super(name, age, gender);
        this.specialist =specialist;
    }
    public void displayDoctorInfo(){
        display();
        System.out.println("Specialist: "+specialist );

    }
}

public class HumanMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr Shukla", 67, "Male", "Cardiologist");
        doctor.displayDoctorInfo();
    }
}
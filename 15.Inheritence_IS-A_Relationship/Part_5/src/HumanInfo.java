import java.util.Scanner;

class Humans{
    String name;
    String gender;
    int age;

    Humans(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    void displayHuman(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
    }
}

class Engineer extends Humans{
    String skill;

    Engineer(String name, String gender, int age, String skill){
        super(name,gender,age);
        this.skill =skill;
    }
    void displayEngineerDetails(){
        displayHuman();
        System.out.println("Skill: "+skill);
    }
}

class EnginnerInputInfo{
    public static Engineer createEngineer(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name:");
        String name = sc.next();

        System.out.print("Enter Gender:");
        String gender = sc.next();

        System.out.print("Enter Age:");

        int age = sc.nextInt();
        System.out.print("Enter Skill:");
        String skill = sc.next();

        System.out.println("*****************");

        Engineer engineer = new Engineer(name, gender, age, skill);
        return engineer;
    }
}

public class HumanInfo {
    public static void main(String[] args) {
        Engineer engineer = EnginnerInputInfo.createEngineer();
        engineer.displayEngineerDetails();
    }
}

class Human{
    String name;
    String gender;
}
class Teacher extends Human{
    String occupation;
}
public class HumanMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name="Martin";
        teacher.gender="MALE";
        teacher.occupation = "Teacher";
        System.out.println("Name: "+teacher.name);
        System.out.println("Gender: "+teacher.gender);
        System.out.println("Occupation: " + teacher.occupation);
    }
}

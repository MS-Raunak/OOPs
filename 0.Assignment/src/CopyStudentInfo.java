class Student{
    int id;
    String name;
    int age;
    static int sid = 100;
   /* static {
       sid = 1000;
    }
    {
        sid++;
        id = sid;
    }

    */
    Student(String name, int age){
        id=sid++;
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println("Student Id: "+id);
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("***********************");
    }
}

public class CopyStudentInfo {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", 22);
        s1.show();

        Student s2 = new Student("Sita", s1.age);
        s2.show();

        Student s3 = new Student(s2.name, 28);
        s3.show();

    }
}

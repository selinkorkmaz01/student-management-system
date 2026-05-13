import java.util.ArrayList;

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Selin", 101));
        students.add(new Student("Emre", 102));

        for (Student student : students) {
            student.displayInfo();
            System.out.println("----------------");
        }
    }
}

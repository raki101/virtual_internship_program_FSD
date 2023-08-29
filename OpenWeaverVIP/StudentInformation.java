package OpenWeaverVIP;

public class StudentInformation {
    public static void main(String[] args) {
        Student student1 = new Student("Raju", 21, "computer Science");
        Student student2 = new Student("Ramu", 19, "Information Technology");

        System.out.println("xxxxxxxxxSTUDENT INFORMATIONxxxxxxxxx");
        student1.displayInfo();
        student2.displayInfo();
    }
}

class Student {
    String name, course;
    int age;

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void displayInfo() {
        System.out.println();
        System.out.println("Name of Student: " + name);
        System.out.println("Age of the Student: " + age);
        System.out.println("Course opted by the Student: " + course);
    }

}

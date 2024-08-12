class Student {
    private String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Student Name: " + name);
    }
}

public class task2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("shaheer");

        student1.printName();
        student2.printName();
    }
}

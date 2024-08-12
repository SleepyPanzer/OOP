
class Student {
  String name;
  int id;
  double gpa;

  public Student(String name, int id, double gpa) {
    this.name = name;
    this.id = id;
    this.gpa = gpa;
  }

  public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("GPA: " + gpa);
  }
}

class task3 {
  public static void main(String[] args) {
    Student student = new Student("shaheer", 12345, 3.8);
    student.displayDetails();
  }
}

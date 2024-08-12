class Circle {
    double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.printf("Radius: %.2f, Area: %.2f\n", radius, getArea());
    }
}

public class task2 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(10.2);
        Circle circle3 = new Circle(12.0);

        circle1.display();
        circle2.display();
        circle3.display();
    }
}

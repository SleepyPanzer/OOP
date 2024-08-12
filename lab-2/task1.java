
import java.util.Scanner;

public class Task1 {
    public static double bmi(double height, double weight) {
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight:");
        double weight = sc.nextDouble();
        System.out.println("Enter the height:");
        double height = sc.nextDouble();

        double bmi = bmi(height, weight);
        System.out.print("The BMI is " + bmi + " so ");

        if (bmi < 18.5) {
            System.out.print("underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.print("healthy");
        } else if (bmi >= 24.9 && bmi < 30) {
            System.out.print("overweight");
        } else if (bmi >= 30) {
            System.out.print("suffering from obesity");
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(100);
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the index of the array (0 to 99): ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Please enter an index between 0 and 99.");
        } finally {
            scanner.close();
        }
    }

    static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }
}

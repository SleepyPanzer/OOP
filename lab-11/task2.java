import java.util.Scanner;

public class task2 {

    static void checkDuplicate(int[] numbers) throws Exception {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    throw new Exception("Duplicate number found: " + numbers[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();
        System.out.println("Enter the integers:");

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        try {
            checkDuplicate(numbers);
            System.out.println("No duplicates found.");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

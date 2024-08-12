import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(26);

        char correspondingChar = (char) ('A' + randomNumber);

        System.out.println("Random Number: " + randomNumber);
        System.out.println("Corresponding Character: " + correspondingChar);
    }
}


  import java.util.Random;

  public class task2 {  
      public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(25) + 1;

        char correspondingChar = (char) ('A' + randomNumber - 1);

        System.out.println("Random Number: " + randomNumber);
        System.out.println("Corresponding Character: " + correspondingChar);
    }
}



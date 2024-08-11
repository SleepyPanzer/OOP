public class task1 {

  static void checkEvenNumber(int number) throws OddNumberException {
      if (number % 2 != 0) {
          throw new OddNumberException("Number is odd: " + number);
      }
  }

  static class OddNumberException extends Exception {
      public OddNumberException(String message) {
          super(message);
      }
  }

  public static void main(String[] args) {
      int number = 25;
      try {
          checkEvenNumber(number);
          System.out.println("Number " + number + " is even.");
      } catch (OddNumberException e) {
          System.out.println(e.getMessage());
      }
  }
}

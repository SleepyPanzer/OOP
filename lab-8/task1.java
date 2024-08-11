class Card {
  public void greeting() {
      System.out.println("Generic Greeting");
  }
}

class Valentine extends Card {
  public void greeting() {
      System.out.println("Happy Valentine's Day");
  }
}

class Holiday extends Card {
  public void greeting() {
      System.out.println("Season's Greetings");
  }
}

class Birthday extends Card {
  public void greeting() {
      System.out.println("Happy Birthday");
  }
}

public class task1 {
  public static void main(String[] args) {
      Card valentine = new Valentine();
      Card holiday = new Holiday();
      Card birthday = new Birthday();

      valentine.greeting();
      holiday.greeting();
      birthday.greeting();
  }
}

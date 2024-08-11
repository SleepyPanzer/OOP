class Food {
  public Food() {
      System.out.println("Food");
  }
}

class Fruit extends Food {
  public Fruit() {
      super();
      System.out.println("Fruit");
  }
}

class Apple extends Fruit {
  public Apple() {
      super();
      System.out.println("Apple");
  }
}

public class task3 {
  public static void main(String[] args) {
      Apple apple = new Apple(); 
  }
}

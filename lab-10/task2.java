interface Vehicle {
  void speed(); 
}

class Car implements Vehicle {
  public void speed() {
      System.out.println("Car is running");
  }
}

public class task2 {
  public static void main(String[] args) {
      Car car = new Car(); 
      car.speed(); 
  }
}

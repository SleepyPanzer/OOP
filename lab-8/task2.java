class Vehicle {
   String make;
   String model;
   int year;
   String fuelType;

  public Vehicle(String make, String model, int year, String fuelType) {
      this.make = make;
      this.model = model;
      this.year = year;
      this.fuelType = fuelType;
  }

  public String getMake() {
      return make;
  }

  public void setMake(String make) {
      this.make = make;
  }

  public String getModel() {
      return model;
  }

  public void setModel(String model) {
      this.model = model;
  }

  public int getYear() {
      return year;
  }

  public void setYear(int year) {
      this.year = year;
  }

  public String getFuelType() {
      return fuelType;
  }

  public void setFuelType(String fuelType) {
      this.fuelType = fuelType;
  }

  public double calculateFuelEfficiency() {
      return 0.0;
  }

  public double calculateDistanceTraveled(double fuelConsumed) {
      return calculateFuelEfficiency() * fuelConsumed;
  }

  public double getMaxSpeed() {
      return 0.0;
  }
}

class Truck extends Vehicle {

  public Truck(String make, String model, int year, String fuelType) {
      super(make, model, year, fuelType);
  }

  public double calculateFuelEfficiency() {
      return 8.0;
  }

  
  public double getMaxSpeed() {
      return 120.0;
  }
}

class Car extends Vehicle {
  public Car(String make, String model, int year, String fuelType) {
      super(make, model, year, fuelType);
  }

  public double calculateFuelEfficiency() {
      return 25.0;
  }

  public double getMaxSpeed() {
      return 180.0;
  }
}

class Motorcycle extends Vehicle {
  public Motorcycle(String make, String model, int year, String fuelType) {
      super(make, model, year, fuelType);
  }

  
  public double calculateFuelEfficiency() {
      return 60.0;
  }

  public double getMaxSpeed() {
      return 220.0;
  }
}
public class task2 {
  public static void main(String[] args) {
      Vehicle truck = new Truck("Ford", "F-150", 2021, "Diesel");
      Vehicle car = new Car("Toyota", "Camry", 2022, "Petrol");
      Vehicle motorcycle = new Motorcycle("Yamaha", "YZF-R1", 2023, "Petrol");

      System.out.println("Truck:");
      System.out.println("Make: " + truck.getMake());
      System.out.println("Model: " + truck.getModel());
      System.out.println("Year: " + truck.getYear());
      System.out.println("Fuel Type: " + truck.getFuelType());
      System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
      System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h");
      System.out.println();

      System.out.println("Car:");
      System.out.println("Make: " + car.getMake());
      System.out.println("Model: " + car.getModel());
      System.out.println("Year: " + car.getYear());
      System.out.println("Fuel Type: " + car.getFuelType());
      System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
      System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");
      System.out.println();

      System.out.println("Motorcycle:");
      System.out.println("Make: " + motorcycle.getMake());
      System.out.println("Model: " + motorcycle.getModel());
      System.out.println("Year: " + motorcycle.getYear());
      System.out.println("Fuel Type: " + motorcycle.getFuelType());
      System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " km/l");
      System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " km/h");
  }
}

 class Car {
	 String brand;

	public Car() {
			this.brand = "Ford";
	}

	public String getBrand() {
			return brand;
	}
}

public class task1 {
	public static void main(String[] args) {
			Car myCar = new Car();
			String brand = myCar.getBrand();
			System.out.println("Brand: " + brand);
	}
}

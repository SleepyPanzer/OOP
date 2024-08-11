 class AreaCalculator {

  public void printArea(int side) {
      int area = side * side;
      System.out.println("Area of the square: " + area);
  }

  public void printArea(int length, int breadth) {
      int area = length * breadth;
      System.out.println("Area of the rectangle: " + area);
  }
 }
 public class task3{
  public static void main(String[] args) {
      AreaCalculator calculator = new AreaCalculator();
      calculator.printArea(5);        
      calculator.printArea(5, 10);   
  }
}

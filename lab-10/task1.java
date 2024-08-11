interface X {
  int add(int a, int b);
  int sub(int a, int b);
}

class A implements X {
  public int add(int a, int b) {
      return a + b;
  }
  public int sub(int a, int b) {
      return a - b; 
  }
}
public class task1 {
  public static void main(String[] args) {
      A obj = new A(); 

      System.out.println("Addition: " + obj.add(5, 3)); 
      System.out.println("Subtraction: " + obj.sub(5, 3));
  }
}

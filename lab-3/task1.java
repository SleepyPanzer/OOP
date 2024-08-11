import java.util.Scanner;
public class task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int temp;
    int n = 4;
    int[] arr = new int[n];
    System.out.println("Enter the values :");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int k = 1; k < n; k++) {
      for (int ptr = 0; ptr < n - k; ptr++) {
        if (arr[ptr] > arr[ptr + 1]) {
          temp = arr[ptr];
          arr[ptr] = arr[ptr + 1];
          arr[ptr + 1] = temp;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }

  }

}

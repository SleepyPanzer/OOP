import java.util.Scanner;
public class task2 {
public static void main(String[] args) {
  int n=10;
  int temp;
  Scanner sc  = new Scanner(System.in);
  int[] arr=new int [n];
  System.out.println("Enter the values :");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) { 
            // swap temp and arr[i] 
              temp = arr[j]; 
            arr[j] = arr[j + 1]; 
            arr[j + 1] = temp; 
            for (int k= 0; k < n; k++) {
      System.out.println(arr[k] + " ");
}
System.out.println();
 }
}
}
System.out.println("Sorted Array:");
for (int i = 0; i < n; i++) {
    System.out.print(arr[i] + " ");}
}
}
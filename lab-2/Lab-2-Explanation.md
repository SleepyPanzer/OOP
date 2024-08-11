###  Typecasting  and Simple maths operation  
Type-Casting
:The process of converting one data-type to another data-type is termed type casting for example if we want to convert the type of data like int ,double into other data type.
### There are two types of casting: 

### Widening Casting/ Implicit casting (automatically) 

Converting a smaller type to a larger type size  

byte ->short ->char ->int ->long ->float ->double


Example:
```
{
  public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}

}
```
### Narrowing Casting/ Explicit casting (manually) 

Converting a larger type to a smaller size type 

double ->float ->long ->int ->char ->short ->byte

Example 
```
{
  class Main {
  public static void main(String[] args) {
    // create int type variable
    int num = 10;
    System.out.println("The integer value is: " + num);
// converts int to string type
    String data = String.valueOf(num);
    System.out.println("The string value is: " + data);
  } }
}
```
###  Types of Operator in Java 
Java divides the operators into the following groups:

 Basic arithmetic operators are:  	+ ,  - ,  * ,  / ,  %


Assignments operators in java are:   = ,  += , -= , *= ,  /= , %= 

Comparison operators in java are:             == , != , < ,> ,<= ,>=

Logical operators in java are:  && , || , !

### Task-1 explaination
This program calculates your BMI using your weight and height, then tells you if you're underweight, healthy, overweight, or obese.
### Task-2 explaination

it randomly picks a number and shows which letter of the alphabet it matches.
### Task-3 explaination
his Java program is meant to check if a number is prime
in this we  check if we divide by 2 and the reminder of this is  o then it is prime

### Task-4 explaination
This Java program calculates the sum of the digits of a given number we take  modoulus of 10 to get the last digit

### Task-5 explaination
 It computes total minutes per year, then divides the input minutes to find years and remaining days. Finally, it prints the result in years and days.
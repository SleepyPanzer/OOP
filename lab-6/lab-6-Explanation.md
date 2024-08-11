### Method and Constructor overloading 
 Method overloading is a concept that allows declaring multiple methods with same name but different parameters in the same class.

### Ways of method overloading. 
1.Different data type of argument.

2.Different number of arguments. 

Example
```{
void func() { ... }
void func(int a) { ... }
float func(double a) { ... }
float func(int a, float b) {…}
}
```
 ### Overloading by changing the number of parameters

```{
class MethodOverloading {
void display(int a){
System.out.println("Arguments: " + a);
}

void display(int a, int b){
System.out.println("Arguments: " + a + " and " + b);
}}
Class Test{
public static void main(String[] args) {
MethodOverloading  ob = new MethodOverloading();
Ob.display(1);
Ob.display(1, 4);
}}
}
```

### Task Explanations:

1. **Mathematics Class (Method Overloading):**  
   - Create a class named `Mathematics`.
   - Define a `Square()` method that takes an integer and returns its square.
   - Overload the `Square()` method with a different parameter type, like a double.

2. **Student Class (Default Values):**  
   - Create a `Student` class with a name attribute.
   - Define a constructor that sets the name to "Unknown" if no name is provided, otherwise set it to the given name.
   - Print the student's name using this class.

3. **Area Calculation (Method Overloading):**  
   - Create a class with methods to calculate areas of a square and a rectangle.
   - Overload the method by accepting different numbers of parameters (one for square, two for rectangle).

4. **Tree Class (Overloaded Constructors):**  
   - Create a `Tree` class with a height attribute.
   - Define two constructors: one with no arguments, and one that initializes height.
   - Implement an `info()` method to print the height, with one overloaded version accepting a string message.

5. **FormLetterWriter Class (Overloaded Methods):**  
   - Create a `FormLetterWriter` class with two overloaded `displaySalutation()` methods.
   - The first method accepts a last name, the second accepts a first and last name.
   - Both methods print a greeting and a short business message.
   - Use a `main()` method to test both versions of the salutation method.
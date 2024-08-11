class EmptyStackException extends Exception {
  public EmptyStackException(String message) {
      super(message);
  }
}

class Stack {
  private int maxSize;
  private int[] stackArray;
  private int top;

  public Stack(int size) {
      this.maxSize = size;
      this.stackArray = new int[maxSize];
      this.top = -1;
  }

  public void push(int value) {
      if (top < maxSize - 1) {
          stackArray[++top] = value;
      } else {
          System.out.println("Stack is full. Cannot push " + value);
      }
  }

  public int pop() throws EmptyStackException {
      if (top == -1) {
          throw new EmptyStackException("Cannot pop from an empty stack");
      }
      return stackArray[top--];
  }

  public void printStack() throws EmptyStackException {
      if (top == -1) {
          throw new EmptyStackException("Reading from an empty stack");
      }
      for (int i = top; i >= 0; i--) {
          System.out.print(stackArray[i] + " ");
      }
      System.out.println();
  }
}

public class task5 {
  public static void main(String[] args) {
      Stack stack = new Stack(5);
      
      stack.push(10);
      stack.push(20);
      stack.push(30);

      try {
          System.out.println("Stack content:");
          stack.printStack();

          System.out.println("Popped element: " + stack.pop());
          System.out.println("Popped element: " + stack.pop());

          System.out.println("Stack content after popping elements:");
          stack.printStack();

          System.out.println("Popped element: " + stack.pop());

      } catch (EmptyStackException e) {
          System.out.println(e.getMessage());
      }

      try {
          // Attempting to print an empty stack
          System.out.println("Attempting to print an empty stack:");
          stack.printStack();
      } catch (EmptyStackException e) {
          System.out.println(e.getMessage());
      }
  }
}

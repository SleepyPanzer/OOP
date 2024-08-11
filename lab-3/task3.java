
    import java.util.Scanner;

    public class task3 {
        static final int max = 6;
        static int[] queue = new int[max];
        static int front = -1;
        static int rear = -1;
        static void enqueue(int element) {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                queue[rear] = element;
            } else if ((rear + 1) % max == front) {
                System.out.println("Queue is overflow..");
            } else {
                rear = (rear + 1) % max;
                queue[rear] = element;
            }
        }
        static void dequeue() {
            if (front == -1 && rear == -1) {
                System.out.println("Queue is underflow..");
            } else if (front == rear) {
                System.out.println("The dequeued element is " + queue[front]);
                front = -1;
                rear = -1;
            } else {
                System.out.println("The dequeued element is " + queue[front]);
                front = (front + 1) % max;
            }
        }
    
          static void display() {
            int i = front;
            if (front == -1 && rear == -1) {
                System.out.println("Queue is empty..");
            } else {
                System.out.print("Elements in a Queue are: ");
                while (i <= rear) {
                    System.out.print(queue[i] + ",");
                    i = (i + 1) % max;
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
           enqueue(2);
           enqueue(3);
           enqueue(6);
           display();
           System.out.println("after deque");
           dequeue();
           display();
           
        }
    }
    
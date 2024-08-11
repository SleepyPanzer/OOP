class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }

    void display(node headNode) {
        while (headNode != null) {
            System.out.print(headNode.data + " ");
            headNode = headNode.next;
        }
    }

    node reverse(node headNode) {
        node previous = null;
        node current = headNode;
        node next = null;
        while (current != null) {
            next = current.next; // Store the next node
            current.next = previous; // Reverse the pointer of the current node
            previous = current;
            current = next;
        }
        return previous;
    }
}

public class task2 {
    public static void main(String[] args) {
        node n1 = new node(16);
        node n2 = new node(23);
        node n3 = new node(24);
        node n4 = new node(29);
        node n5 = new node(38);

        node headNode = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println("Original list was: ");
        n1.display(headNode);
        System.out.println("\nAfter reversing the list: ");
        headNode = n1.reverse(headNode);
        n1.display(headNode);
    }
}
